public class Book3 {
	String title;
	String author;
	double price;
	boolean availability;
	Book3(String title,String author,double price) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.availability = true;
	}
	public void borrowBook() {
		if(this.availability == true) {
			System.out.println("Book borrowed successfully");
			this.availability = false;
		} else {
			System.out.println("Book is not available");
		}
	}
	public void display() {
		System.out.println("Title: "+this.title);
		System.out.println("Author: "+this.author);
		System.out.println("Price: "+this.price);
		System.out.println("Available: "+this.availability);
		System.out.println("---------------------------");
	}
	public static void main(String[] args) {
		Book3 book1 = new Book3("Gunaho Ka Devta","Dharamveer Bharti",260.0);
		book1.display();
		book1.borrowBook();
		book1.borrowBook(); 
		book1.display();
	}
}
