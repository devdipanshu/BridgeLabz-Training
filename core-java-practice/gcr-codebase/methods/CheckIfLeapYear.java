import java.util.Scanner;

public class CheckIfLeapYear {
	public static boolean isLeapYear(int year) {
		if(year%4==0 && year%100!=0) {
			return true;
		}
		else if(year%400 == 0) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		boolean isLeapYear = isLeapYear(year);
		if(year>=1582) {
			if(isLeapYear) {
				System.out.println("Yes the year "+year+" is a leap year");
			}
			else {
				System.out.println("No the year "+year+" is not a leap year");
			}
		}
		else {
			System.out.println("The LeapYear program does not works for year < 1582");
		}
		sc.close();
		
	}
}
