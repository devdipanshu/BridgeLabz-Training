public class Book4 {
	public String ISBN;
	protected String title;
	private String author;
	
	Book4(String ISBN, String title, String author){
		this.ISBN = ISBN;
		this.title = title;
		setAuthor(author);
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return this.author;
	}
}

class EBook extends Book4 {
	EBook(String ISBN, String title, String author){
		super(ISBN, title, author);
	}
	public void displayEBook() {
		System.out.println("ISBN: "+ISBN);
		System.out.println("Title: "+title);
		System.out.println("Author: "+getAuthor());
		System.out.println("------------------------");
	}
	public static void main(String[] args) {
		EBook ebook = new EBook("978-0134685991","Effective Java","Joshua Bloch");
		ebook.displayEBook();
	}
}
