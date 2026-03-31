import java.util.ArrayList;
import java.util.Scanner;

class BookNotAvailableException extends Exception{
	BookNotAvailableException(String msg){
		super(msg);
	}
}

class Book{
	String title;
	String author;
	String status;

	Book(String title,String author,String status){
		this.title = title;
		this.author = author;
		this.status = status;
	}

	void updateBookStatus(String status){
		this.status = status;
	}

	void displayDetails(){
		System.out.println("Book Title : "+this.title);
		System.out.println("Book Author : "+this.author);
		System.out.println("Book Status : "+this.status);
		System.out.println("----------------------------");
	}
}

public class LibraryManagementSystem2 {

	private static ArrayList<Book> addBooks(Scanner sc){
		System.out.print("How many books you want to add: ");
		int n = sc.nextInt();
		sc.nextLine();

		ArrayList<Book> list = new ArrayList<Book>();

		for(int i = 0;i<n;i++){
			System.out.print("Enter title for book "+(i+1)+": ");
			String title = sc.nextLine();

			System.out.print("Enter author for book "+(i+1)+": ");
			String author = sc.nextLine();

			System.out.print("Enter status (Available/Checked Out): ");
			String status = sc.nextLine();

			list.add(new Book(title,author,status));
		}
		return list;
	}

	private static Book[] convertListToArray(ArrayList<Book> list){
		Book[] books = new Book[list.size()];
		for(int i = 0;i<list.size();i++){
			books[i] = list.get(i);
		}
		return books;
	}

	public static void searchBookByTitle(Book[] books,String keyword){
		System.out.println("Search Result:");
		for(int i = 0;i<books.length;i++){
			if(books[i].title.toLowerCase().contains(keyword.toLowerCase())){
				books[i].displayDetails();
			}
		}
	}

	public static void checkoutBook(Book book) throws BookNotAvailableException{
		if(book.status.equalsIgnoreCase("Checked Out")){
			throw new BookNotAvailableException("Book is already checked out");
		}
		else{
			book.updateBookStatus("Checked Out");
			System.out.println("Book checked out successfully");
		}
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		ArrayList<Book> bookList = addBooks(sc);
		Book[] books = convertListToArray(bookList);

		System.out.println("All Books:");
		for(int i = 0;i<books.length;i++){
			books[i].displayDetails();
		}

		System.out.print("Enter keyword to search book: ");
		String keyword = sc.nextLine();
		searchBookByTitle(books,keyword);

		try{
			checkoutBook(books[0]);
		}
		catch(BookNotAvailableException e){
			System.out.println(e.getMessage());
		}
		System.out.println("After Checkout:");
		for(int i = 0;i<books.length;i++){
			books[i].displayDetails();
		}

		sc.close();
	}
}
