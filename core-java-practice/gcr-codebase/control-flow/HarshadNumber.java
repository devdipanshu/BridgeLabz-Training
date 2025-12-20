import java.util.Scanner;

public class HarshadNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int sum = 0;
		int temp = number;
		while(temp>0) {
			int digit = temp%10;
			sum+=digit;
			temp = temp/10;
		}
		
		if(number%sum==0) {
			System.out.println("The number "+number+" is Harshad number");
		}
		else {
			System.out.println("The number "+number+" is not Harshad number");
		}
		sc.close();
	}
}
