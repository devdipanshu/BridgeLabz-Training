import java.util.Scanner;

public class LargestAndSecondLargestDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long number = sc.nextLong();
		int maxDigit = 10;
		long[] digits = new long[maxDigit];
		int index = 0;
		while (number > 0) {
			if (index == digits.length) {
				break;
			}
			long digit = number % 10;
			digits[index] = digit;
			number = number / 10;
			index++;

		}
		long largestDigit = 0;
		long secondLargestDigit = 0;
		for (int i = 0; i < digits.length; i++) {
			if (digits[i] > largestDigit) {
				secondLargestDigit = largestDigit;
				largestDigit = digits[i];
			} else if (digits[i] > secondLargestDigit && digits[i] != largestDigit) {
				secondLargestDigit = digits[i];
			}
		}

		System.out.println("Largest Digit: " + largestDigit);
		System.out.println("Second Largest Digit: " + secondLargestDigit);
		sc.close();
	}
}
