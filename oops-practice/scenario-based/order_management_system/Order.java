package order_management_system;

import java.util.ArrayList;

public class Order {
	private static int id = 0;
	private ArrayList<Product> order;
	Order(ArrayList<Product> order){
		this.order = order;
		id++;
	}
	public int getId() {
		return id;
	}
	public ArrayList<Product> getOrder(){
		return order;
	}
//	OrderManagement orderManagement = new OrderManagement();
//	public void addOrder(ArrayList<Product> cart) {
//		order.add(cart);
//		orderManagement.orders.add(cart);
//	}
}
