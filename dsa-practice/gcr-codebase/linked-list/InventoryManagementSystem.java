class ItemNode {

	int itemId;
	String itemName;
	int quantity;
	double price;
	ItemNode next;
	ItemNode(int itemId, String itemName, int quantity, double price) {
		this.itemId = itemId;
		this.itemName = itemName;
		this.quantity = quantity;
		this.price = price;
	}
}

public class InventoryManagementSystem {

	public static ItemNode head = null;
	public void insertAtBeginning(ItemNode node) {

		node.next = head;
		head = node;
	}
	public void insertAtEnd(ItemNode node) {

		if (head == null) {
			head = node;
			return;
		}
		ItemNode temp = head;

		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = node;
	}

	public void insertAtSpecificPosition(ItemNode node, int position) {
		if (position <= 1) {
			insertAtBeginning(node);
			return;
		}
		ItemNode temp = head;
		int count = 1;
		while (temp != null && count < position - 1) {
			temp = temp.next;
			count++;
		}
		if (temp == null) {
			insertAtEnd(node);
		} else {
			node.next = temp.next;
			temp.next = node;
		}
	}

	public void removeByItemId(int itemId) {

		if (head == null) {
			System.out.println("Inventory Empty");
			return;
		}
		if (head.itemId == itemId) {
			head = head.next;
			System.out.println("Item Removed");
			return;
		}

		ItemNode temp = head;

		while (temp.next != null) {
			if (temp.next.itemId == itemId) {
				temp.next = temp.next.next;
				System.out.println("Item Removed");
				return;
			}
			temp = temp.next;
		}

		System.out.println("Item Not Found");
	}

	public void updateQuantity(int itemId, int newQuantity) {

		ItemNode temp = head;

		while (temp != null) {
			if (temp.itemId == itemId) {
				temp.quantity = newQuantity;
				System.out.println("Quantity Updated");
				return;
			}
			temp = temp.next;
		}

		System.out.println("Item Not Found");
	}

	public void searchByItemId(int itemId) {

		ItemNode temp = head;

		while (temp != null) {
			if (temp.itemId == itemId) {
				System.out.println(temp.itemId + " | " + temp.itemName + " | " + temp.quantity + " | " + temp.price);
				return;
			}
			temp = temp.next;
		}

		System.out.println("Item Not Found");
	}

	public void searchByItemName(String name) {

		ItemNode temp = head;
		boolean found = false;

		while (temp != null) {
			if (temp.itemName.equalsIgnoreCase(name)) {
				System.out.println(temp.itemId + " | " + temp.itemName + " | " + temp.quantity + " | " + temp.price);
				found = true;
			}
			temp = temp.next;
		}

		if (found == false) {
			System.out.println("Item Not Found");
		}
	}

	public void totalInventoryValue() {

		ItemNode temp = head;
		double total = 0;

		while (temp != null) {
			total = total + (temp.price * temp.quantity);
			temp = temp.next;
		}

		System.out.println("Total Inventory Value: " + total);
	}

	public void sortByName(boolean ascending) {

		if (head == null) {
			return;
		}

		ItemNode i;
		ItemNode j;

		for (i = head; i.next != null; i = i.next) {
			for (j = i.next; j != null; j = j.next) {

				if ((ascending && i.itemName.compareToIgnoreCase(j.itemName) > 0) ||
				    (!ascending && i.itemName.compareToIgnoreCase(j.itemName) < 0)) {

					int id = i.itemId;
					String name = i.itemName;
					int qty = i.quantity;
					double price = i.price;

					i.itemId = j.itemId;
					i.itemName = j.itemName;
					i.quantity = j.quantity;
					i.price = j.price;

					j.itemId = id;
					j.itemName = name;
					j.quantity = qty;
					j.price = price;
				}
			}
		}
	}

	public void sortByPrice(boolean ascending) {

		if (head == null) {
			return;
		}

		ItemNode i;
		ItemNode j;
		for (i = head; i.next != null; i = i.next) {
			for (j = i.next; j != null; j = j.next) {
				if ((ascending && i.price > j.price) ||
				    (!ascending && i.price < j.price)) {
					int id = i.itemId;
					String name = i.itemName;
					int qty = i.quantity;
					double price = i.price;
					i.itemId = j.itemId;
					i.itemName = j.itemName;
					i.quantity = j.quantity;
					i.price = j.price;
					j.itemId = id;
					j.itemName = name;
					j.quantity = qty;
					j.price = price;
				}
			}
		}
	}
	public void displayInventory() {
		ItemNode temp = head;
		while (temp != null) {
			System.out.println(temp.itemId + " | " + temp.itemName + " | " + temp.quantity + " | " + temp.price);
			temp = temp.next;
		}
	}

	public static void main(String[] args) {

		InventoryManagementSystem obj = new InventoryManagementSystem();
		obj.insertAtBeginning(new ItemNode(101, "Keyboard", 5, 1500));
		obj.insertAtEnd(new ItemNode(102, "Mouse", 10, 700));
		obj.insertAtSpecificPosition(new ItemNode(103, "Monitor", 3, 12000), 2);
		obj.displayInventory();
		obj.updateQuantity(102, 15);
		obj.searchByItemName("Monitor");
		obj.totalInventoryValue();
		obj.sortByName(true);
		obj.displayInventory();
		obj.sortByPrice(false);
		obj.displayInventory();
		obj.removeByItemId(101);
		obj.displayInventory();
	}
}
