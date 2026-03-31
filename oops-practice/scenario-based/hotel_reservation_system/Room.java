package hotel_reservation_system;

class Room {

    private int roomId;
    private String type;
    private boolean isBooked;
    private double basePrice;

    Room(int roomId, String type, double basePrice) {
        this.roomId = roomId;
        this.type = type;
        this.basePrice = basePrice;
        this.isBooked = false;
    }

    int getRoomId() { return roomId; }
    String getType() { return type; }
    double getBasePrice() { return basePrice; }
    boolean isBooked() { return isBooked; }

    void bookRoom() { isBooked = true; }
    void releaseRoom() { isBooked = false; }
}

