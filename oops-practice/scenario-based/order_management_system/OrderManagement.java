package order_management_system;

import java.util.ArrayList;

public class OrderManagement {
	public static ArrayList<Product> products = new ArrayList<>();
	public static ArrayList<Order> orders = new ArrayList<>();
	public void displayProducts() {
		System.out.println("ID      NAME      PRICE      QTY");
		for(Product key: products) {
			System.out.println(key.getId()+"      "+key.getName()+"      "+key.getPrice()+"      "+key.getQuantity());
		}
	}
	public void addToCart(int id, Customer obj) {
		boolean add = false;
		for(Product key: products) {
			if(key.getId()==id) {
				if(key.getQuantity()>0) {
					obj.getCart().add(key);
					System.out.println("Product Added to Cart Successfully");
					add = true;
				}
				else {
					System.out.println("Product is Unavailable");
					add = true;
				}
				break;
			}
		}
		if(add == false) {
			System.out.println("Product ID is not available");
		}
	}
	public void removeFromCart(int id,Customer obj) {
		for(Product key: products) {
			if(key.getId()==id) {
				obj.getCart().remove(key);
				System.out.println("Product Removed Successfully");
				break;
			}
		}
	}
	
	public int addOrder(ArrayList<Product> cart) {
		Order order = new Order(cart);
		orders.add(order);
		return order.getId();
	}
	public void removeOrder(int id) {
		for(Order key: orders) {
			if(key.getId()==id) {
				orders.remove(key);
				System.out.println("Order Cancelled Successfully");
			}
		}
	}
}
