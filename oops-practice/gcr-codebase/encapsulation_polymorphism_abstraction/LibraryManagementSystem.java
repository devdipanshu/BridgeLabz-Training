package encapsulation_inheritance_polymorphism;

interface Reservable {
    void reserveItem();
    boolean checkAvailability();
}

abstract class LibraryItem {

    private int itemId;
    private String title;
    private String author;
    private int quantity;

    abstract int getLoanDuration();

    LibraryItem(int itemId,String title,String author,int quantity) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.quantity = quantity;
    }

    public void getItemDetails() {
        System.out.println("Item Id: "+itemId);
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Quantity: "+quantity);
    }

    public int getQuantity() {
        return quantity;
    }

    public void reservedItem() {
        quantity = quantity - 1;
    }

    public void addItem(int qty) {
        quantity = quantity + qty;
    }
}

class Book extends LibraryItem implements Reservable {

    Book(int itemId,String title,String author,int quantity) {
        super(itemId,title,author,quantity);
    }

    int getLoanDuration() {
        int days = 14;
        return days;
    }

    public void reserveItem() {
        this.reservedItem();
        System.out.println("Book Reserved");
    }

    public boolean checkAvailability() {
        if(getQuantity() > 0) {
            return true;
        }
        return false;
    }
}

class Magazine extends LibraryItem implements Reservable {

    Magazine(int itemId,String title,String author,int quantity) {
        super(itemId,title,author,quantity);
    }

    int getLoanDuration() {
        int days = 7;
        return days;
    }

    public void reserveItem() {
        this.reservedItem();
        System.out.println("Magazine Reserved");
    }

    public boolean checkAvailability() {
        if(getQuantity() > 0) {
            return true;
        }
        return false;
    }
}

class DVD extends LibraryItem implements Reservable {

    DVD(int itemId,String title,String author,int quantity) {
        super(itemId,title,author,quantity);
    }

    int getLoanDuration() {
        int days = 3;
        return days;
    }

    public void reserveItem() {
        this.reservedItem();
        System.out.println("DVD Reserved");
    }

    public boolean checkAvailability() {
        if(getQuantity() > 0) {
            return true;
        }
        return false;
    }
}

public class LibraryManagementSystem {

    public static void processItems(LibraryItem[] list) {

        for(int i = 0;i<list.length;i++) {
            list[i].getItemDetails();
            int duration = list[i].getLoanDuration();
            System.out.println("Loan Duration: "+duration+" days");
            Reservable r = (Reservable)list[i];
            if(r.checkAvailability()) {
                r.reserveItem();
            } else {
                System.out.println("Item Not Available");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LibraryItem l1 = new Book(101,"Java Basics","Herbert Schildt",2);
        LibraryItem l2 = new Magazine(102,"Tech Today","Editorial Team",1);
        LibraryItem l3 = new DVD(103,"Inception","Christopher Nolan",0);
        LibraryItem[] items = {l1,l2,l3};
        processItems(items);
    }
}

