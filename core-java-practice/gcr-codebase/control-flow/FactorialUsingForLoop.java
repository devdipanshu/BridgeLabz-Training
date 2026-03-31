import java.util.Scanner;

public class FactorialUsingForLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int temp = num;
		if(temp>0) {
			int fact = 1;
			for(temp = 1;temp<=num;temp++) {
				fact = fact*temp;
			}
			System.out.println("Factorial of number "+num+" is "+fact);
		}
		else {
			System.out.println("Number should be a positive number");
		}
		sc.close();
		
	}
}
