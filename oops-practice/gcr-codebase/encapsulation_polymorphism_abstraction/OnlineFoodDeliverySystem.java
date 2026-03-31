package encapsulation_inheritance_polymorphism;

interface Discountable {
    void applyDiscount();
    void showDiscount();
}

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    abstract double calculateTotalPrice();

    FoodItem(String itemName,double price,int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public void showItemDetails() {
        System.out.println("Item Name : " + itemName);
        System.out.println("Price     : " + price);
        System.out.println("Quantity  : " + quantity);
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int qty) {
        this.quantity = qty;
    }

    public void reduceQuantity() {
        quantity = quantity - 1;
    }
}

class VegItem extends FoodItem implements Discountable {
    private double discount;

    VegItem(String itemName,double price,int quantity) {
        super(itemName,price,quantity);
        discount = 0;
    }

    double calculateTotalPrice() {
        double total = getPrice() * getQuantity();
        total = total - discount;
        return total;
    }

    public void applyDiscount() {
        discount = 20;
    }

    public void showDiscount() {
        System.out.println("Veg Item Discount : " + discount);
    }
}

class NonVegItem extends FoodItem implements Discountable {
    private double discount;
    private double extraCharge;

    NonVegItem(String itemName,double price,int quantity) {
        super(itemName,price,quantity);
        discount = 0;
        extraCharge = 50;
    }

    double calculateTotalPrice() {
        double total;
        total = (getPrice() * getQuantity()) + extraCharge;
        total = total - discount;
        return total;
    }

    public void applyDiscount() {
        discount = 30;
    }

    public void showDiscount() {
        System.out.println("Non-Veg Item Discount : " + discount);
    }
}

public class OnlineFoodDeliverySystem {

    public static void processOrder(FoodItem[] list) {

        for(int i = 0;i<list.length;i++) {
            list[i].showItemDetails();

            double total = list[i].calculateTotalPrice();
            System.out.println("Total Price : " + total);

            Discountable d = (Discountable)list[i];
            d.showDiscount();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        FoodItem f1 = new VegItem("Paneer Burger",120,2);
        FoodItem f2 = new NonVegItem("Chicken Pizza",250,1);

        Discountable d1 = (Discountable)f1;
        d1.applyDiscount();
        Discountable d2 = (Discountable)f2;
        d2.applyDiscount();
        FoodItem[] order = {f1,f2};
        processOrder(order);
    }
}
