import java.util.Scanner;

public class printQuotientAndRemainder {
	public static int[] findRemainderAndQuotient(int number, int divisor) {
		int remainder = number%divisor;
		int quotient = number/divisor;
		int[]result = {quotient,remainder};
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int divisor = sc.nextInt();
		int[]result = findRemainderAndQuotient(number,divisor);
		System.out.println("quotient is: "+result[0]);
		System.out.println("remainder is: "+result[1]);
		sc.close();
	}
}
