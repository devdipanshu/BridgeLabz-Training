import java.util.Scanner;

public class ReverseANumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int temp = number;
		int count = 0;

		while (temp > 0) {
			count++;
			temp = temp / 10;
		}

		int[] digits = new int[count];
		int index = count - 1;

		while (number > 0) {
			digits[index] = number % 10;
			number = number / 10;
			index--;
		}

		int[] reversedArray = new int[count];
		int revIndex = 0;
		for (int i = count - 1; i >= 0; i--) {
			reversedArray[revIndex] = digits[i];
			revIndex++;
		}

		for (int i = 0; i < count; i++) {
			System.out.print(reversedArray[i]);
		}

		sc.close();
	}
}
