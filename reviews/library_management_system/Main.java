package library_management_system;

public class Main {
	public static void main(String[] args) {
		try {
			Management m = new Management();
			m.enlistBook(new Book("Java","James",101,2));

			Member mem = new Member();
			mem.setUserDetails("Dipanshu",1);

			mem.issueBook(101,"2025-01-01");

			FineCalculator studentFine = new Student();
			mem.returnBook(101,"2025-01-10",studentFine);

			mem.getUserDetails();

		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
