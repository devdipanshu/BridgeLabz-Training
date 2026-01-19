package library_management_system;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Member implements User {
	String name;
	int id;
	int fine = 0;

	ArrayList<BookIssue> issuedBooks = new ArrayList<>();
	Management m = new Management();

	public void issueBook(int bookId,String date) throws BookNotAvailableException {
		m.issueBook(bookId);
		issuedBooks.add(new BookIssue(bookId,date));
	}

	public void returnBook(int bookId,String returnDate,FineCalculator f) {
		for(BookIssue b : issuedBooks) {
			if(b.bookId == bookId) {
				LocalDate issue = LocalDate.parse(b.issueDate);
				LocalDate ret = LocalDate.parse(returnDate);

				int days = (int)ChronoUnit.DAYS.between(issue, ret);
				fine += f.calculateFine(days);

				issuedBooks.remove(b);
				m.returnBook(bookId);
				return;
			}
		}
	}

	@Override
	public void setUserDetails(String name,int id) {
		this.name = name;
		this.id = id;
	}

	@Override
	public void getUserDetails() {
		System.out.println(name + " | ID : " + id + " | Fine : " + fine);
	}
}

