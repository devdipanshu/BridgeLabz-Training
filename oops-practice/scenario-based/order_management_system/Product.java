package order_management_system;

public class Product {
	private String name;
	private int id;
	private int quantity;
	double price;
	Product(String name,int id,int quantity,double price){
		this.name = name;
		this.id = id;
		this.quantity = quantity;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public int getQuantity() {
		return quantity;
	}
	public double getPrice() {
		return price;
	}
	OrderManagement orderManagement = new OrderManagement();
	public void enlistProduct(Product obj) {
		OrderManagement.products.add(obj);
	}
	public void removeProduct(Product obj) {
		OrderManagement.products.remove(obj);
	}
}
