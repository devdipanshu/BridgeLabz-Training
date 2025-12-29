import java.util.Scanner;

public class MovieTicketBookingApp {

	public static void getDetails(int i) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the genre of the movie(Action/Thriller/Scifi/Suspense/Drama):");
		String genre = sc.next();
		switch(genre) {
		case "Action":
			processBooking("Action",i,sc);
			break;

		case "Thriller":
			processBooking("Thriller",i,sc);
			break;

		case "Scifi":
			processBooking("Scifi",i,sc);
			break;

		case "Suspense":
			processBooking("Suspense",i,sc);
			break;

		case "Drama":
			processBooking("Drama",i,sc);
			break;

		default:
			System.out.println("Invalid movie type selected");
		}
	}
	public static void processBooking(String movieType,int i,Scanner sc) {

		System.out.println("Select the seat type(gold/silver)");
		String seatType = sc.next();

		System.out.println("Do you want snacks(yes/no)");
		String needSnacks = sc.next();

		System.out.println("Customer number: "+(i+1));
		System.out.println("Movie Type: "+movieType);

		if(seatType.equals("gold")) {
			System.out.println("Seat Type: Gold");
		}
		else {
			System.out.println("Seat Type: Silver");
		}

		if(needSnacks.equals("yes")) {
			System.out.println("Snacks Included: Yes");
		}
		else {
			System.out.println("Snacks Included: No");
		}
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of customers:");
		int customers = sc.nextInt();
		for(int i = 0;i<customers;i++) {
			getDetails(i);
			System.out.println("------------------------");
		}
		sc.close();
	}
}

