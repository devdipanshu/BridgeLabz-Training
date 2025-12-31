public class Product {
	String productName;
	double price;
	static int totalProducts;
	
	Product(String productName,double price) {
		this.productName = productName;
		this.price = price;
		totalProducts++;
	}
	public void displayProductDetails() {
		System.out.println("Product Name: "+this.productName);
		System.out.println("Price: "+this.price);
		System.out.println("----------------------------");
		System.out.println();
	}
	
	public static void displayTotalProducts() {
		System.out.println("Number of total products created is: "+totalProducts);
	}
	public static void main(String[] args) {
		Product product1 = new Product("Laptop",55000.0);
		Product product2 = new Product("Mouse",500.0);
		Product product3 = new Product("Keyboard",1200.0);
		product1.displayProductDetails();
		product2.displayProductDetails();
		product3.displayProductDetails();
		Product.displayTotalProducts();
	}
}