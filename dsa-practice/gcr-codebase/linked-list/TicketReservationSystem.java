class TicketNode {

	int ticketId;
	String customerName;
	String movieName;
	int seatNumber;
	String bookingTime;
	TicketNode next;

	TicketNode(int ticketId,String customerName,String movieName,int seatNumber,String bookingTime){
		this.ticketId = ticketId;
		this.customerName = customerName;
		this.movieName = movieName;
		this.seatNumber = seatNumber;
		this.bookingTime = bookingTime;
	}
}

public class TicketReservationSystem {

	static TicketNode head = null;
	static TicketNode tail = null;

	public void addTicket(TicketNode node) {
		if(head == null) {
			head = node;
			tail = node;
			node.next = head;
		}
		else {
			tail.next = node;
			node.next = head;
			tail = node;
		}
	}

	public TicketNode removeTicket(int ticketId) {
		if(head == null) {
			return null;
		}

		if(head.ticketId == ticketId) {
			TicketNode deleted = head;

			if(head == tail) {
				head = null;
				tail = null;
			}
			else {
				head = head.next;
				tail.next = head;
			}
			return deleted;
		}

		TicketNode temp = head;

		while(temp.next != head) {
			if(temp.next.ticketId == ticketId) {
				TicketNode deleted = temp.next;
				temp.next = temp.next.next;
				if(deleted == tail) {
					tail = temp;
				}
				return deleted;
			}
			temp = temp.next;
		}
		return null;
	}

	public void displayTickets() {
		if(head == null) {
			System.out.println("No Tickets Booked");
			return;
		}

		TicketNode temp = head;
		do {
			System.out.println(temp.ticketId+" "+temp.customerName+" "+temp.movieName+" "+temp.seatNumber+" "+temp.bookingTime);
			temp = temp.next;
		}while(temp != head);
	}

	public TicketNode searchByCustomerOrMovie(String value) {
		if(head == null) {
			return null;
		}

		TicketNode temp = head;
		do {
			if(temp.customerName.equalsIgnoreCase(value) || temp.movieName.equalsIgnoreCase(value)) {
				return temp;
			}
			temp = temp.next;
		}while(temp != head);

		return null;
	}

	public int countTickets() {
		if(head == null) {
			return 0;
		}

		int count = 0;
		TicketNode temp = head;
		do {
			count++;
			temp = temp.next;
		}while(temp != head);

		return count;
	}

	public static void main(String[] args) {

		TicketReservationSystem obj = new TicketReservationSystem();

		obj.addTicket(new TicketNode(101,"Aman","Jawan",15,"10:30 AM"));
		obj.addTicket(new TicketNode(102,"Rohit","Animal",18,"11:00 AM"));
		obj.addTicket(new TicketNode(103,"Neha","Jawan",21,"12:15 PM"));

		obj.displayTickets();

		System.out.println("Total Tickets: "+obj.countTickets());

		TicketNode t = obj.searchByCustomerOrMovie("Jawan");
		if(t != null) {
			System.out.println("Found: "+t.customerName+" "+t.movieName);
		}

		obj.removeTicket(102);
		obj.displayTickets();
	}
}
