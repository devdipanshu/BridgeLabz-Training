package library_management_system;

public class Staff implements FineCalculator {
	public int calculateFine(int days) {
		if(days > 10) {
			return (days - 10) * 5;
		}
		return 0;
	}
}
