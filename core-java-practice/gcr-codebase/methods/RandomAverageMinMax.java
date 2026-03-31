import java.util.Scanner;

public class RandomAverageMinMax {
	public static int[] generate4DigitRandomArray(int size) {
		int[] numbers = new int[size];
		for(int i = 0;i<numbers.length;i++) {
			int random = (int)(Math.random() * 9000) + 1000;
			numbers[i] = random;
		}
		return numbers;
	}
	public static double[] findAverageMinMax(int[] numbers) {
		int min = numbers[0];
		int max = numbers[0];
		int sum = 0;
		for(int i = 0;i<numbers.length;i++) {
			sum += numbers[i];
			min = Math.min(min,numbers[i]);
			max = Math.max(max,numbers[i]);
		}
		double average = (double)sum / numbers.length;
		double[] result = new double[3];
		result[0] = average;
		result[1] = min;
		result[2] = max;
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = 5;
		int[] numbers = generate4DigitRandomArray(size);
		System.out.println("Generated Random Numbers are: ");
		for(int i = 0;i<numbers.length;i++) {
			System.out.print(numbers[i]+" ");
		}
		System.out.println();
		double[] result = findAverageMinMax(numbers);
		System.out.println("The Average value of Random numbers is: "+result[0]);
		System.out.println("The Minimum value of Random numbers is: "+result[1]);
		System.out.println("The Maximum value of Random numbers is: "+result[2]);
		sc.close();
	}
}
