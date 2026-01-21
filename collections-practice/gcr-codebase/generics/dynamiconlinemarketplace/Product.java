package dynamiconlinemarketplace;

class Product<T extends Category> {

    String name;
    double price;
    T category;

    Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    void display() {
        System.out.println(name + " | ₹" + price + " | " + category.getCategoryName());
    }
}
