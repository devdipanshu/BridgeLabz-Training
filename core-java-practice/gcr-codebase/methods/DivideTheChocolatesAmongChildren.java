import java.util.Scanner;

public class DivideTheChocolatesAmongChildren {
	public static int[]findRemainderAndQuotient(int number, int divisor) {
		int remainder = number%divisor;
		int quotient = number/divisor;
		int[]result = {quotient,remainder};
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numberOfChocolates = sc.nextInt();
		int numberOfChildrens = sc.nextInt();
		
		int[]result = findRemainderAndQuotient(numberOfChocolates,numberOfChildrens);
		System.out.println("Chocolates that each children get: "+result[0]);
		System.out.println("Chocolates that are left to distribute: "+result[1]);
		sc.close();
	}
}
