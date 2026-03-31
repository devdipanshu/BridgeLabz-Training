public class Item {
	String itemCode;
	String itemName;
	double price;
	Item(String itemCode,String itemName,double price){
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.price = price;
	}
	public double calculateTotalCost(int quantity) {
		double totalCost = this.price * quantity;
		return totalCost;
	}
	public void displayItemDetails() {
		System.out.println("itemCode: "+this.itemCode);
		System.out.println("itemPrice: "+this.price);
		System.out.println("itemName: "+this.itemName);
		System.out.println("----------------------------");
	}
	public static void main(String[] args) {
		Item item1 = new Item("01AA","Water bottle",500.0);
		Item item2 = new Item("01BB","Rice",700.0);
		Item item3 = new Item("02AA","blackboard",400.0);
		item1.displayItemDetails();
		item2.displayItemDetails();
		item3.displayItemDetails();
	}
}
