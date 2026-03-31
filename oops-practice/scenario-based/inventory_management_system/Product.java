package inventory_management_system;

class Product {
    int productId;
    String name;
    int quantity;
    double price;
    int threshold;

    Product(int productId,String name,int quantity,double price,int threshold){
        this.productId = productId;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.threshold = threshold;
    }
}
