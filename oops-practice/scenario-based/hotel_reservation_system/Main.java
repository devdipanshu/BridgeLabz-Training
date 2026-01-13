package hotel_reservation_system;

public class Main {

    public static void main(String[] args) {

        Hotel.addRoom(new DeluxeRoom(101, 200));
        Hotel.addRoom(new DeluxeRoom(102, 200));
        Hotel.addRoom(new StandardRoom(201, 100));
        Hotel.addRoom(new StandardRoom(202, 100));

        Hotel.viewAvailableRooms();

        Guest g1 = new Guest("Rohit", 1, "1234567890");
        Guest g2 = new Guest("Aman", 2, "0987654321");

        try {
            Reservation r1 = Hotel.bookRoom(g1, "Deluxe", 3, new SeasonalPricing());
            Reservation r2 = Hotel.bookRoom(g2, "Standard", 2, new NormalPricing());

            r1.showInvoice();
            r2.showInvoice();

            r1.checkout();
            r2.checkout();

            Hotel.viewAvailableRooms();

        } catch (RoomNotAvailableException e) {
            System.out.println(e.getMessage());
        }
    }
}
