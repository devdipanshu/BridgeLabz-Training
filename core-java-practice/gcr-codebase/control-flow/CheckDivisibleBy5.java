import java.util.Scanner;

public class CheckDivisibleBy5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num%5==0) {
			System.out.println("Yes, the number is divisible by 5");
		}
		else {
			System.out.println("No, the number is not divisible by 5");
		}
		sc.close();
	}
}
