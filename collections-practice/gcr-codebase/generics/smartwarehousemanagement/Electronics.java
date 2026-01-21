package smartwarehousemanagement;

class Electronics extends WarehouseItem {

    Electronics(String name) {
        super(name);
    }

    void display() {
        System.out.println("Electronics Item: " + name);
    }
}
