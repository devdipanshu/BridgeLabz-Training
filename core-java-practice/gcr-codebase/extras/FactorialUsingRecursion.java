import java.util.Scanner;

public class FactorialUsingRecursion {
	public static int takeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		sc.close();
		return n;
	}
	public static int calculateFactorial(int n) {
		if(n==1 || n==0) {
			return n;
		}
		return n*calculateFactorial(n-1);
	}
	public static void displayResult(int result,int n) {
		System.out.println("The factorial of the number "+n+" is: "+result);
	}
	public static void main(String[] args) {
		int n = takeInput();
		int result = calculateFactorial(n);
		displayResult(result,n);
	}
}
