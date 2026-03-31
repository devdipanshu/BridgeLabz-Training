import java.util.Scanner;

public class TheCoffeeCounterChronicles {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Coffee Type          Price Chart");
		System.out.println();
		System.out.println("Amaricano               90INR");
		System.out.println("Cappuccino               165INR");
		System.out.println("Latte                   235INR");
		System.out.println();
		
		System.out.println("Which coffee do you want: ");
		String coffeeType = sc.next();
		System.out.println("How Many "+coffeeType+"  do you want: ");
		int quantity = sc.nextInt();
        int price = 0;
		switch(coffeeType) {
		    case "Amaricano":
		    	price = 90;
		    	break;
		    case "Cappuccino":
		    	price = 165;
		    	break;
		    case "Latte":
		    	price = 235; 
		    	break;
		}
		int bill = price*quantity;
		int gst = 5;
		bill = bill+((bill*gst)/100);
		System.out.println("Your bill of "+quantity+" "+coffeeType+" is: "+bill);
		sc.close();
	}
}
