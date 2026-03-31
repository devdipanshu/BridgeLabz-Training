public class Book {
	String title;
	String author;
	double price;
	
	Book(String title,String author,double price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public void displayBookDetails() {
		System.out.println("Title of the book: "+this.title);
		System.out.println("Author of the book: "+this.author);
		System.out.println("Price of the book: "+this.price);
	}
	public static void main(String[] args) {
		Book book1 = new Book("2States","Chetan Bhagat",500.0);
		Book book2 = new Book("Wings Of Fire","A.P.J Abdul Kalam",500.0);
		book1.displayBookDetails();
		book2.displayBookDetails();
	}
}
