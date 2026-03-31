import java.util.Scanner;

public class CalculateSimpleInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int principal = sc.nextInt();
		int rate = sc.nextInt();
		float time = sc.nextFloat();
		float simpleinterest = (principal*rate*time)/100;
		System.out.println(simpleinterest);
		sc.close();

	}

}


