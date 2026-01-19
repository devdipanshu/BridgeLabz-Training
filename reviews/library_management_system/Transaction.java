package library_management_system;

public class Transaction implements FineCalculator {
	int finePerDay = 20;

	public int calculateFine(int days) {
		if(days > 5) {
			return (days - 5) * finePerDay;
		}
		return 0;
	}
}
