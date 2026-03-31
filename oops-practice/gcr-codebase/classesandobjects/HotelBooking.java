public class HotelBooking {
	String guestName;
	String roomType;
	int nights;
	
	HotelBooking(){
		this.guestName = "Dipanshu";
		this.roomType = "Deluxe";
		this.nights = 1;
	}
	HotelBooking(String guestName,String roomType,int nights){
		this.guestName = guestName;
		this.roomType = roomType;
		this.nights = nights;
	}
	HotelBooking(HotelBooking booking){
		this.guestName = booking.guestName;
		this.roomType = booking.roomType;
		this.nights = booking.nights;
	}
	
	public void display() {
		System.out.println("Guest Name: "+this.guestName);
		System.out.println("Room Type: "+this.roomType);
		System.out.println("Number of Night: "+this.nights);
		System.out.println("------------------------------");
		System.out.println();
	}
	
	public static void main(String[] args) {
		HotelBooking booking1 = new HotelBooking();
		HotelBooking booking2 = new HotelBooking("Ravish Kumar","Super Deluxe",2);
		HotelBooking booking3 = new HotelBooking(booking2);
		
		System.out.println("Default Constructor: ");
		booking1.display();
		System.out.println("Parameterized Constructor: ");
		booking2.display();
		System.out.println("Copy Constructor: ");
		booking3.display();
	}
}
