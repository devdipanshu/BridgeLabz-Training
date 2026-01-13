package order_management_system;

public class Main {
	public static void main(String[] args) {
		Product product1 = new Product("Shampoo",101,2,202.45);
		product1.enlistProduct(product1);
		Product product2 = new Product("Oil",102,2,203.44);
		product2.enlistProduct(product2);
		Customer customer = new Customer("Dipanshu","7452976379");
		customer.browseProducts();
		customer.addToCart(101, customer);
		customer.addToCart(102, customer);
		customer.placeOrder();
	}
}
