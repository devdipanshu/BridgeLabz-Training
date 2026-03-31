public class Book {
	
	static String libraryName;
	String title;
	String author;
	final String ISBN;
	static void displayLibraryName() {
		System.out.println("Library Name: "+libraryName);
	}
	public Book(String libraryName,String title, String author, String ISBN) {
		Book.libraryName = libraryName;
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
	}
	public void display(Book book) {
		if(book instanceof Book) {
			System.out.println("Title: "+this.title);
			System.out.println("Author: "+this.author);
			System.out.println("ISBN: "+this.ISBN);
		}
		else {
			System.out.println("Book doesnot found");
		}
		
	}
	public static void main(String[] args) {
		displayLibraryName();
		Book book = new Book("Egmore Library","Effective Java","Joshu Bloch","978-0134685991");
		book.display(book);
	}
}
