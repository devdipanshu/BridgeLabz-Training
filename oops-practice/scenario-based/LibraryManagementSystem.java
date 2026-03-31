import java.util.Scanner;

class Book{
	String title;
	String author;
	String status;
	Book(String title,String author,String status){
		this.title = title;
		this.author = author;
		this.status = status;
	}
	void updateBookStatus(String status) {
		this.status = status;
	}
	void displayDetails() {
		System.out.println("Book title: "+this.title);
		System.out.println("Book author: "+this.author);
		System.out.println("Book status: "+this.status);
		System.out.println("---------------------------");
		System.out.println();
	}
}
public class LibraryManagementSystem {
	public static void searchBookByTitle(Book[] books, String keyword) {
		for(int i = 0;i<books.length;i++) {
			if(books[i].title.toLowerCase().contains(keyword.toLowerCase())) {
				books[i].displayDetails();
			}
		}
	}

	private static Book[] addBook(Scanner sc) {
		System.out.println("How many books you want to add: ");
		int n = sc.nextInt();
		sc.nextLine();
		Book[] books = new Book[n];
		for(int i = 0;i<n;i++) {
			System.out.print("Enter title for book "+(i+1)+": ");
			String title = sc.nextLine();
			System.out.print("Enter author for book "+(i+1)+": ");
			String author = sc.nextLine();
			System.out.print("Enter status for book "+(i+1)+": ");
			String status = sc.nextLine();
			books[i] = new Book(title,author,status);
		}
		return books;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Book[] books = addBook(sc);
		System.out.print("Details before updating the status");
		
		for(int i = 0;i<books.length;i++) {
			books[i].displayDetails();
		}
		
		//Updating the status of book 0
		books[0].updateBookStatus("Checked Out");
		
		System.out.print("Details after updating the status");
		
		for(int i = 0;i<books.length;i++) {
			books[i].displayDetails();
		}
		
	}
}
