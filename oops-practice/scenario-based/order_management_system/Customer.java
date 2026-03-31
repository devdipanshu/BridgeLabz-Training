package order_management_system;

import java.util.ArrayList;
import java.util.Scanner;

public class Customer {
	private String name;
	private String contactNumber;
	ArrayList<Product> cart = new ArrayList<>();
	Customer(String name,String contactNumber){
		this.name = name;
		this.contactNumber = contactNumber;
	}
	OrderManagement orderManagement = new OrderManagement();
	public void browseProducts() {
		orderManagement.displayProducts();
	}
	public ArrayList<Product> getCart(){
		return cart;
	}
	public void addToCart(int id,Customer obj) {
		orderManagement.addToCart(id,obj);
	}
	public void removeFromCart(int id,Customer obj) {
		orderManagement.removeFromCart(id,obj );
	}
	public double getTotalAmount() {
		double total = 0;
		for(Product key: cart) {
			total+=key.getPrice();
		}
		return total;
	}
	public void displayInfo(int id) {
		for(Product key: cart) {
			System.out.println(key.getId()+"      "+key.getName()+"      "+key.getPrice());
		}
		System.out.println("Total Amount is: "+getTotalAmount());
	}
	public void emptyCart() {
		cart = new ArrayList<>();
	}
	public int placeOrder() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Payment Method(UPI/CARD/WALLET)");
		String method = sc.next();
		int id = 0;
		boolean paymentStatus = false;
		if(method.equalsIgnoreCase("card")) {
			CardPayment cp = new CardPayment();
			try {
				cp.payAmount(getTotalAmount());
				paymentStatus = true;
			}
			catch(PaymentFailedException e) {
				System.out.println(e.getMessage());
			}
		}
		else if(method.equalsIgnoreCase("upi")) {
			UPIPayment up = new UPIPayment();
			try {
				up.payAmount(getTotalAmount());
				paymentStatus = true;
			}
			catch(PaymentFailedException e) {
				System.out.println(e.getMessage());
			}
		}
		else if(method.equalsIgnoreCase("wallet")) {
			WalletPayment wp = new WalletPayment();
			try {
				wp.payAmount(getTotalAmount());
				paymentStatus = true;
			}
			catch(PaymentFailedException e) {
				System.out.println(e.getMessage());
			}
		}
		if(paymentStatus == true) {
			id = orderManagement.addOrder(cart);
			displayInfo(id);
			emptyCart();
		}
		return id;
	}
	public void cancelOrder(int id) {
		orderManagement.removeOrder(id);
	}
	
}
