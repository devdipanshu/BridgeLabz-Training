import java.util.Scanner;

public class CheckIfAbundantNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int sum = 0;
		for(int i = 1;i<12;i++) {
			if(number%i ==0) {
				sum+=i;
			}
		}
		if(sum>number) {
			System.out.println("The number "+number+" is abundant number");
		}
		else {
			System.out.println("The number "+number+" is not abundant number");
		}
		sc.close();
	}
}
