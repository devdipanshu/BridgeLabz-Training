import java.util.Scanner;

public class NumberChecker5{
	public static int sumOfProperDivisors(int number){
		int sum = 0;
		for(int i = 1;i<number;i++){
			if(number%i==0){
				sum = sum + i;
			}
		}
		return sum;
	}
	public static boolean isPerfectNumber(int number){
		int sum = sumOfProperDivisors(number);
		if(sum == number){
			return true;
		}
		return false;
	}
	public static boolean isAbundantNumber(int number){
		int sum = sumOfProperDivisors(number);
		if(sum > number){
			return true;
		}
		return false;
	}
	public static boolean isDeficientNumber(int number){
		int sum = sumOfProperDivisors(number);
		if(sum < number){
			return true;
		}
		return false;
	}
	public static int factorial(int digit){
		int fact = 1;
		for(int i = 1;i<=digit;i++){
			fact = fact * i;
		}
		return fact;
	}
	public static boolean isStrongNumber(int number){
		int temp = number;
		int sum = 0;
		while(temp>0){
			int digit = temp%10;
			sum = sum + factorial(digit);
			temp = temp/10;
		}
		if(sum == number){
			return true;
		}
		return false;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = sc.nextInt();
		System.out.println("Is this number is perfect Number: "+isPerfectNumber(number));
		System.out.println("Is this number is abundant Number: "+isAbundantNumber(number));
		System.out.println("Is this number is deficient Number: "+isDeficientNumber(number));
		System.out.println("Is this number is strong Number: "+isStrongNumber(number));
		sc.close();
	}
}
