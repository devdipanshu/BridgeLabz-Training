import java.util.Scanner;

public class SumOfNNaturalNumber {
	public static int sumOfNNumbers(int n) {
		int count = 0;
		for(int i = 1;i<=n;i++) {
			count+=i;
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = sumOfNNumbers(num);
		System.out.println("Sum of n natural number is: "+sum);
		sc.close();
	}
}
