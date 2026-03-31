import java.util.Scanner;

public class PrimeNumberChecker{
	public static boolean isPrime(int number){
		if(number<=1){
			return false;
		}
		for(int i = 2;i<number;i++){
			if(number%i==0){
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		boolean result = isPrime(number);
		if(result==true){
			System.out.println("The number "+number+" is a prime number");
		}else{
			System.out.println("The number "+number+" is not a prime number");
		}
		sc.close();
	}
}
