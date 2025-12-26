import java.util.Scanner;

public class NumberChecker4{
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
	public static boolean isNeonNumber(int number){
		int square = number*number;
		int sum = 0;
		while(square>0){
			int digit = square%10;
			sum = sum + digit;
			square = square/10;
		}
		if(sum == number){
			return true;
		}
		return false;
	}
	public static boolean isSpyNumber(int number){
		int sum = 0;
		int product = 1;
		while(number>0){
			int digit = number%10;
			sum = sum + digit;
			product = product * digit;
			number = number/10;
		}
		if(sum == product){
			return true;
		}
		return false;
	}
	public static boolean isAutomorphicNumber(int number){
		int square = number*number;
		int temp = number;
		while(temp>0){
			if(square%10 != temp%10){
				return false;
			}
			square = square/10;
			temp = temp/10;
		}
		return true;
	}
	public static boolean isBuzzNumber(int number){
		if(number%7==0 || number%10==7){
			return true;
		}
		return false;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		System.out.println("Is this number is prime Number: "+isPrime(number));
		System.out.println("Is this number is neon Number: "+isNeonNumber(number));
		System.out.println("Is this number is spy Number: "+isSpyNumber(number));
		System.out.println("Is this number is automorphic Number: "+isAutomorphicNumber(number));
		System.out.println("Is this number is buzz Number: "+isBuzzNumber(number));
		sc.close();
	}
}
