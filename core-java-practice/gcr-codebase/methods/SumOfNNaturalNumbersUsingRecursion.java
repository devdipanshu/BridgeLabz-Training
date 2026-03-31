import java.util.Scanner;

public class SumOfNNaturalNumbersUsingRecursion {
	public static int sumUsingRecursion(int num) {
		if(num == 0) {
			return 0;
		}
		return num + sumUsingRecursion(num - 1);
	}
	public static int sumUsingFormula(int num) {
		int sum = (num*(num+1))/2;
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if(num>0) {
			int sumUsingRecursion = sumUsingRecursion(num);
			int sumUsingFormula = sumUsingFormula(num);
			System.out.println("Sum of n natural number using recursion is: "+sumUsingRecursion);
			System.out.println("Sum of n natural number using formula is: "+sumUsingFormula);

			if(sumUsingRecursion == sumUsingFormula) {
				System.out.println("Both results are correct and equal");
			}
			else {
				System.out.println("Results are not equal");
			}
		}
		else {
			System.out.println(num+" is not a natural number");
		}
		sc.close();
	}
}
