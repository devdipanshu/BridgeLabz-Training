public class CartItem {
	String itemName;
	double price;
	int quantity;
	CartItem(String itemName,double price,int quantity){
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}
	public void addItem(int qty) {
		this.quantity = this.quantity + qty;
		System.out.println("Added "+qty+" of "+this.itemName+" to the cart.");
	}
	public void removeItem(int qty) {
		if(qty <= this.quantity) {
			this.quantity = this.quantity - qty;
			System.out.println("Removed "+qty+" of "+this.itemName+" from the cart.");
		}
		else {
			System.out.println("Cannot remove more items than available.");
		}
	}
	public void displayTotalCost() {
		double totalCost = this.price * this.quantity;
		System.out.println("Total cost: $"+totalCost);
	}
	public void displayItemDetails() {
		System.out.println("Item: "+this.itemName+", Price: $"+this.price+", Quantity: "+this.quantity);
	}
	
	public static void main(String[] args) {
		CartItem item = new CartItem("Laptop",999.99,1);
		item.displayItemDetails();
		item.addItem(2);
		item.removeItem(1);
		item.displayTotalCost();
	}
}
