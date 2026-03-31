import java.util.Scanner;

public class SumUntilZero {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		double total = sc.nextInt();
		while(num!=0) {
			total+=num;
			num = sc.nextDouble();
		}
		System.out.println(total);
		sc.close();
	}
}
