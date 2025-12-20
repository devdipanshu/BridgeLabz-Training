
import java.util.Scanner;

public class SumUntilZeroOrNegative {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double total = sc.nextInt();
		double num = 0;
		while(true) {
			num = sc.nextDouble();
			if(num <=0) {
				break;
			}
			total+=num;
			
		}
		System.out.println(total);
		sc.close();
	}
}

