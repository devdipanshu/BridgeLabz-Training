import java.util.Scanner;

public class NumberChecker2{
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
	public static int findSumOfDigits(int[] digits){
		int sum = 0;
		for(int i = 0;i<digits.length;i++){
			sum += digits[i];
		}
		return sum;
	}
	public static int findSumOfSquares(int[] digits){
		int sum = 0;
		for(int i = 0;i<digits.length;i++){
			sum += (int)Math.pow(digits[i],2);
		}
		return sum;
	}
	public static boolean isHarshadNumber(int number,int[] digits){
		int sum = findSumOfDigits(digits);
		if(sum != 0 && number % sum == 0){
			return true;
		}
		return false;
	}
	public static int[][] findDigitFrequency(int[] digits){
		int[][] freq = new int[10][2];
		for(int i = 0;i<10;i++){
			freq[i][0] = i;
			freq[i][1] = 0;
		}
		for(int i = 0;i<digits.length;i++){
			freq[digits[i]][1]++;
		}
		return freq;
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
		int sum = findSumOfDigits(digits);
		System.out.println("The sum of digits is: "+sum);
		int sumSq = findSumOfSquares(digits);
		System.out.println("The sum of squares of digits is: "+sumSq);
		System.out.println("The harshad Number is: "+isHarshadNumber(number,digits));
		int[][] freq = findDigitFrequency(digits);
		System.out.println("Frequency of the digits is: ");
		for(int i = 0;i<freq.length;i++){
			if(freq[i][1]>0){
				System.out.println(freq[i][0]+" -> "+freq[i][1]);
			}
		}
		sc.close();
	}
}
