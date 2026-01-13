package hotel_reservation_system;

class RoomNotAvailableException extends Exception {
    RoomNotAvailableException(String msg) {
        super(msg);
    }
}