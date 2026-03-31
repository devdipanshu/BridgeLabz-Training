public class Product {
	static int discount = 10;
	String productName;
	int price;
	int quantity;
	final String productId;
	static void updateDiscount(int discount) {
		Product.discount = discount;
	}
	Product(String productName,int price,int quantity,String productId){
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
		this.productId = productId;
	}
	public void display(Product product) {
		if(product instanceof Product) {
			System.out.println("Product Id: "+product.productId);
			System.out.println("Product Name: "+product.productName);
			System.out.println("Price: $"+product.price);
			System.out.println("Quantity: "+product.quantity);
			System.out.println("Discount: "+Product.discount+"%");
			System.out.println("Price after discount: "+(product.price-(product.price*Product.discount/100)));
		}
	}
	public static void main(String[] args) {
		Product product1 = new Product("Laptop",1200,5,"P002");
		Product product2 = new Product("Smartphone",800,5,"P002");
		updateDiscount(15);
		product1.display(product1);
		product2.display(product2);
	}
}
