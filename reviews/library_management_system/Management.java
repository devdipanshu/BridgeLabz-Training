package library_management_system;

import java.util.ArrayList;

public class Management {
	static ArrayList<Book> books = new ArrayList<>();

	public void enlistBook(Book book) {
		books.add(book);
	}

	public void issueBook(int bookId) throws BookNotAvailableException {
		for(Book book : books) {
			if(book.id == bookId) {
				if(book.qty > 0) {
					book.qty--;
					return;
				}
				else {
					throw new BookNotAvailableException("Book Not Available");
				}
			}
		}
		throw new BookNotAvailableException("Invalid Book ID");
	}

	public void returnBook(int bookId) {
		for(Book book : books) {
			if(book.id == bookId) {
				book.qty++;
				return;
			}
		}
	}
}
