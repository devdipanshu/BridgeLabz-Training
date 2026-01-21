package smartwarehousemanagement;

class Furniture extends WarehouseItem {

    Furniture(String name) {
        super(name);
    }

    void display() {
        System.out.println("Furniture Item: " + name);
    }
}
