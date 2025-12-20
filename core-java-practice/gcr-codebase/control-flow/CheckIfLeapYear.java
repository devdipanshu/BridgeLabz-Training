import java.util.Scanner;

public class CheckIfLeapYear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if(year<1582) {
			System.out.println("Year must be greater than 1582");
		}
		else if(year%400==0) {
			System.out.println("Year "+year+" is a leap year");
		}
		else if(year%4 == 0 && year%100!=0) {
			System.out.println("Year "+year+" is a leap year");
		}
		else {
			System.out.println("Year "+year+" is not a leap year");
		}
		sc.close();
	}
}
