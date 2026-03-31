package smartwarehousemanagement;

abstract class WarehouseItem {

    String name;

    WarehouseItem(String name) {
        this.name = name;
    }

    abstract void display();
}