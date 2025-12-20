import java.util.Scanner;

public class BonusOfEmployees {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int salary = sc.nextInt();
		int bonus = 0;
		if(year>5) {
			bonus = bonus+(salary*5/100);
		}
		System.out.println("The bonus amount is "+bonus);
		sc.close();
	}
}
