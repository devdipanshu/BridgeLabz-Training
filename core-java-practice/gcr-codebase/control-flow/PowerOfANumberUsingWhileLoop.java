import java.util.Scanner;

public class PowerOfANumberUsingWhileLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int power = sc.nextInt();
		int result = 1;
		if(number>0 && power>0) {
			int counter = 0;
			while(counter <power){
				result*=number;
				counter++;
			}
		}
		else {
			System.out.println("Input should be positive");
		}
		System.out.println("Power of "+number+" is "+result);
		sc.close();
	}
}