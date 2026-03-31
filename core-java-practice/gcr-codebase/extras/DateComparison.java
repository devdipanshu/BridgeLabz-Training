import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first date: ");
		String str1 = sc.next();
		System.out.println("Enter Second date: ");
		String str2 = sc.next();
		LocalDate date1 = LocalDate.parse(str1);
		LocalDate date2 = LocalDate.parse(str2);

		if(date1.isBefore(date2)) {
			System.out.println("The first date is before the second date");
		}
		else if(date1.isAfter(date2)) {
			System.out.println("The first date is after the second date");
		}
		else if(date1.isEqual(date2)) {
			System.out.println("Both the dates are equal");
		}

		sc.close();
	}
}
