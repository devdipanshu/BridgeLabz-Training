import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class RohansLibraryReminderApp {
	public static int calculateFine(int i,Scanner sc) {
		System.out.println("Enter the Due Date of book "+(i+1)+" in yyyy-mm-dd");
		String date1 = sc.next();
		LocalDate dueDate = LocalDate.parse(date1);
		System.out.println("Enter the Return Date of book "+(i+1)+" in yyyy-mm-dd");
		String date2 = sc.next();
		LocalDate returnDate = LocalDate.parse(date2);
		int days = (int)ChronoUnit.DAYS.between(dueDate,returnDate);
		if(days>0) {
			return 5*days;
		}
		else {
			return 0;
		}
	}
	public static void displayFine(int fine,int i) {
		System.out.println("Fine of "+(i+1)+"th book is "+fine);
		System.out.println("--------------------------------------");
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i<5;i++) {
			int fine = calculateFine(i,sc);
			displayFine(fine,i);
		}
		sc.close();
	}
}

