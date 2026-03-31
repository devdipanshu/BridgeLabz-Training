package hotel_reservation_system;

class Guest {

    private String name;
    private int id;
    private String contact;

    Guest(String name, int id, String contact) {
        this.name = name;
        this.id = id;
        this.contact = contact;
    }

    String getName() { return name; }
    int getId() { return id; }
    String getContact() { return contact; }
}
