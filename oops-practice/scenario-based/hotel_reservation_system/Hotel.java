package hotel_reservation_system;

import java.util.ArrayList;

class Hotel {

    static ArrayList<Room> rooms = new ArrayList<Room>();
    static ArrayList<Reservation> reservations = new ArrayList<Reservation>();

    static void addRoom(Room room) {
        rooms.add(room);
    }

    static void viewAvailableRooms() {
        System.out.println("Available Rooms:");
        for(Room r : rooms) {
            if(!r.isBooked()) {
                System.out.println(r.getRoomId() + " - " + r.getType() + " - $" + r.getBasePrice());
            }
        }
    }

    static Reservation bookRoom(Guest guest, String roomType, int nights, PricingStrategy pricing) throws RoomNotAvailableException {
        for(Room r : rooms) {
            if(!r.isBooked() && r.getType().equalsIgnoreCase(roomType)) {
                Reservation res = new Reservation(guest, r, nights, pricing);
                reservations.add(res);
                System.out.println("Room " + r.getRoomId() + " booked for " + guest.getName());
                return res;
            }
        }
        throw new RoomNotAvailableException("No " + roomType + " rooms available");
    }
}
