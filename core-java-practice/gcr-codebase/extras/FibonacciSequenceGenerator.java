import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciSequenceGenerator {
	public static void printSequence(ArrayList<Integer> list) {
		System.out.println("The Sequence is: ");
	}
	public static int calculateLength(int n) {
		int size = 2;
		int i = 0;
		int j = 1;
		int sum = 1;
		while(sum<=n) {
			i = j;
			j = sum;
			sum = i+j;
			size++;
		}
		return size;
	}
	public static int[] generateSequence(int n) {
		int size = calculateLength(n);
		int[] sequence = new int[size];
		int idx = 2;
		int i = 0;
		int j = 1;
		int sum = 1;
		sequence[0] = i;
		sequence[1] = j;
		while(sum<=n) {
			sequence[idx] = sum;
			i = j;
			j = sum;
			sum = i+j;
			idx++;
		}
		return sequence;
	}
	public static void printSequence(int[] arr) {
		System.out.println("The sequence is: ");
		for(int i = 0;i<arr.length-1;i++) {
			System.out.print(arr[i]+"->");
		}
		System.out.print(arr[arr.length-1]);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number 'n'");
		int n = sc.nextInt();
		int[] sequence = generateSequence(n);
		printSequence(sequence);
		sc.close();
		
	}
}
