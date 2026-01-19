package library_management_system;

public class Student implements FineCalculator {
	public int calculateFine(int days) {
		if(days > 5) {
			return (days - 5) * 10;
		}
		return 0;
	}
}
