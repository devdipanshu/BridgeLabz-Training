import java.util.Scanner;

public class OTPGenerator{
	public static int generateOTP(){
		int otp = (int)(Math.random()*900000) + 100000;
		return otp;
	}
	public static boolean areOTPsUnique(int[] otpArray){
		for(int i = 0;i<otpArray.length;i++){
			for(int j = i+1;j<otpArray.length;j++){
				if(otpArray[i] == otpArray[j]){
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] otpArray = new int[10];
		for(int i = 0;i<otpArray.length;i++){
			otpArray[i] = generateOTP();
		}
		System.out.println("Generated OTPs are:");
		for(int i = 0;i<otpArray.length;i++){
			System.out.println(otpArray[i]);
		}
		boolean isUnique = areOTPsUnique(otpArray);
		System.out.println("are all OTP's unique: "+isUnique);
		sc.close();
	}
}
