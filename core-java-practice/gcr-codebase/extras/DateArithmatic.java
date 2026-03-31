import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmatic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year");
		int year = sc.nextInt();
		System.out.println("Enter month");
		int month = sc.nextInt();
		System.out.println("Enter day");
		int day = sc.nextInt();
		LocalDate date = LocalDate.of(year, month, day);
		LocalDate result = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
		
		System.out.println("Result after arithmetic is: "+result);
		sc.close();
	}
}
