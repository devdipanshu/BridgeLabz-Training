public class Book2 {
	String title;
	String author;
	double price;
	
	Book2(){
		this.title = "Not Available";
		this.author = "Not Available";
		this.price = 0.0;
	}
	Book2(String title,String author,double price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public void display() {
		System.out.println("Title: "+this.title);
		System.out.println("Author: "+this.author);
		System.out.println("price: "+this.price);
		System.out.println("------------------------");
		System.out.println();
	}
	
	public static void main(String[] args) {
		Book2 book1 = new Book2();
		Book2 book2 = new Book2("Gunaho ka devta","dharamveer bharti",260.0);
		System.out.println("Default Constructor: ");
		book1.display();
		System.out.println("Parameterized Constructor: ");
		book2.display();
	}
}
