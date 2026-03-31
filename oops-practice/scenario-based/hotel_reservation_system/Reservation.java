package hotel_reservation_system;

class Reservation {

    private static int nextId = 1;

    private int reservationId;
    private Guest guest;
    private Room room;
    private int nights;
    private double totalAmount;

    Reservation(Guest guest, Room room, int nights, PricingStrategy pricingStrategy) {
        this.reservationId = nextId++;
        this.guest = guest;
        this.room = room;
        this.nights = nights;
        this.totalAmount = pricingStrategy.calculatePrice(room.getBasePrice(), nights);
        room.bookRoom();
    }

    int getReservationId() { return reservationId; }
    Guest getGuest() { return guest; }
    Room getRoom() { return room; }
    int getNights() { return nights; }
    double getTotalAmount() { return totalAmount; }

    void checkout() {
        room.releaseRoom();
        System.out.println("Guest " + guest.getName() + " checked out from Room " + room.getRoomId());
    }

    void showInvoice() {
        System.out.println("Invoice for " + guest.getName() + ": Room " + room.getType() + 
                           " for " + nights + " nights. Total: $" + totalAmount);
    }
    
}
