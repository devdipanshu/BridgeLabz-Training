package smartwarehousemanagement;

class Groceries extends WarehouseItem {

    Groceries(String name) {
        super(name);
    }

    void display() {
        System.out.println("Grocery Item: " + name);
    }
}

