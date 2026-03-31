import java.util.Scanner;

public class CafeteriaMenuApp {

	public static void displayMenu(String[] items) {
		System.out.println("----- CAFETERIA MENU -----");
		for(int i = 0;i<items.length;i++) {
			System.out.println(i+" : "+items[i]);
		}
	}

	public static String getItemByIndex(String[] items,int index) {
		if(index < 0 || index >= items.length) {
			return "Invalid Item Selected";
		}
		return items[index];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] items = {
			"Tea","Coffee","Sandwich","Burger","Pizza",
			"Pasta","Noodles","Fries","Juice","Ice Cream"
		};

		displayMenu(items);

		System.out.print("Select item index: ");
		int index = sc.nextInt();

		String selectedItem = getItemByIndex(items, index);
		System.out.println("Selected Item: "+selectedItem);

		sc.close();
	}
}
