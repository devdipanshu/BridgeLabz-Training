import java.util.Scanner;

public class NumberChecker3{
	public static int countDigits(int number){
		int count = 0;
		while(number>0){
			count++;
			number = number/10;
		}
		return count;
	}
	public static int[] storeDigits(int number,int count){
		int[] digits = new int[count];
		int index = count-1;
		while(number>0){
			digits[index] = number%10;
			number = number/10;
			index--;
		}
		return digits;
	}
	public static int[] reverseDigits(int[] digits){
		int[] rev = new int[digits.length];
		int index = 0;
		for(int i = digits.length-1;i>=0;i--){
			rev[index] = digits[i];
			index++;
		}
		return rev;
	}
	public static boolean compareArrays(int[] a,int[] b){
		if(a.length != b.length){
			return false;
		}
		for(int i = 0;i<a.length;i++){
			if(a[i] != b[i]){
				return false;
			}
		}
		return true;
	}
	public static boolean isPalindrome(int[] digits){
		int[] rev = reverseDigits(digits);
		return compareArrays(digits,rev);
	}
	public static boolean isDuckNumber(int[] digits){
		for(int i = 0;i<digits.length;i++){
			if(digits[i] != 0){
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		int count = countDigits(number);
		int[] digits = storeDigits(number,count);
		System.out.println("Digits in the number are:");
		for(int i = 0;i<digits.length;i++){
			System.out.println(digits[i]);
		}
		int[] rev = reverseDigits(digits);
		System.out.println("Reversed Digits are:");
		for(int i = 0;i<rev.length;i++){
			System.out.println(rev[i]);
		}
		System.out.println("Is this the palindrome number: "+isPalindrome(digits));
		System.out.println("Is this the duck Number: "+isDuckNumber(digits));
		sc.close();
	}
}
