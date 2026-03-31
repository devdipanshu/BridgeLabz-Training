import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
		System.out.println(format1.format(date));
		System.out.println(format2.format(date));
		System.out.println(format3.format(date));
	}
}
