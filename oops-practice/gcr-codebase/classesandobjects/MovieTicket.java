public class MovieTicket {
	String movieName;
	String seatNumber;
	double price;
	boolean isBooked;
	MovieTicket(){
		this.isBooked = false;
	}
	public void bookTicket(String movieName,String seatNumber,double price) {
		if(this.isBooked == false) {
			this.movieName = movieName;
			this.seatNumber = seatNumber;
			this.price = price;
			this.isBooked = true;
			System.out.println("Ticket booked for movie: "+this.movieName);
			System.out.println("Seat Number: "+this.seatNumber);
		}
		else {
			System.out.println("House full!!! sorry..... Ticket already booked");
		}
	}
	public void displayTicketDetails() {
		if(this.isBooked == false) {
			System.out.println("Ticket have not booked yet....");
		}
		else {
			System.out.println("Price: $"+this.price);
			System.out.println("Ticket booked for movie: "+this.movieName);
			System.out.println("Seat Number: "+this.seatNumber);
			System.out.println("Price: $"+this.price);
		}
	}
	
	public static void main(String[] args) {
		MovieTicket ticket = new MovieTicket();
		ticket.displayTicketDetails();
		ticket.bookTicket("Dragon","A10",120.0);
		ticket.bookTicket("Dragon","A10",120.0);
		ticket.bookTicket("Dragon","A10",120.0);
		ticket.displayTicketDetails();
	}
}
