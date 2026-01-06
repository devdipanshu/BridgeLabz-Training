import java.util.Scanner;

public class MathUtility {

	public static long calculateFactorial(int n) {
		if(n < 0) {
			System.out.println("Factorial not defined for negative numbers");
			return -1;
		}
		long fact = 1;
		for(int i = 1;i<=n;i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static boolean isPrime(int n) {
		if(n <= 1) {
			return false;
		}
		for(int i = 2;i<=n/2;i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int findGCD(int a,int b) {
		if(a < 0) {
			a = -a;
		}
		if(b < 0) {
			b = -b;
		}
		while(b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

	public static int findFibonacci(int n) {
		if(n < 0) {
			System.out.println("Fibonacci not defined for negative numbers");
			return -1;
		}
		if(n == 0) {
			return 0;
		}
		if(n == 1) {
			return 1;
		}
		int a = 0;
		int b = 1;
		int c = 0;
		for(int i = 2;i<=n;i++) {
			c = a + b;
			a = b;
			b = c;
		}
		return c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number for factorial: ");
		int num = sc.nextInt();
		long fact = calculateFactorial(num);
		if(fact != -1) {
			System.out.println("Factorial: " + fact);
		}

		System.out.print("Enter number to check prime: ");
		int p = sc.nextInt();
		if(isPrime(p)) {
			System.out.println(p+ " is a Prime Number");
		} else {
			System.out.println(p+ " is not a Prime Number");
		}

		System.out.print("Enter first number for GCD: ");
		int x = sc.nextInt();
		System.out.print("Enter second number for GCD: ");
		int y = sc.nextInt();
		System.out.println("GCD: " + findGCD(x, y));

		System.out.print("Enter n for Fibonacci: ");
		int n = sc.nextInt();
		int fib = findFibonacci(n);
		if(fib != -1) {
			System.out.println("Fibonacci number: " + fib);
		}

		sc.close();
	}
}
