import java.util.Scanner;

public class MetroSmartCardFareDeduction {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to Delhi Metro");
		int balance = 200;
		boolean flag = true;
		while (flag) {
			System.out.println("Your current balance is: " + balance);
			System.out.println("Enter distance in km and if you want to exit then enter -1: ");
			int distance = sc.nextInt();

			if (distance < 0) {
				System.out.println("Thank you for using Delhi Metro");
				break;
			}
			
			int fare = (distance <= 5) ? 10 : (distance <= 15) ? 20 : 30;
			System.out.println("Your fare is "+fare+" rupees if you want to continue this ride then enter 0 otherwise enter any other number");
			int consent = sc.nextInt();
			if(consent == 0) {
				if (balance >= fare) {
					balance = balance - fare;
					System.out.println("Fare deducted: " + fare);
				}
				else {
					System.out.println("Insufficient balance, cannot travel further");
					break;
				}
			}
			else {
				System.out.println("We recieved your consent, you don't want to continue this ride");
			}
			
		}

		System.out.println("Remaining balance in your smart card is: " + balance);
	}
}
