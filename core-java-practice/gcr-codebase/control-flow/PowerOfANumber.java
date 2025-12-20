import java.util.Scanner;

public class PowerOfANumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int power = sc.nextInt();
		int result = 1;
		if(number>0 && power>0) {
			for(int i = 1;i<=power;i++) {
				result*=number;
			}
		}
		else {
			System.out.println("Input should be positive");
		}
		System.out.println("Power of "+number+" is "+result);
		sc.close();
	}
}
