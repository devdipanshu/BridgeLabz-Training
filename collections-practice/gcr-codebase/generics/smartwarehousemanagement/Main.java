package smartwarehousemanagement;

class Main {

    public static void main(String[] args) {

        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop"));
        electronicsStorage.addItem(new Electronics("Mobile"));

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Rice"));
        groceriesStorage.addItem(new Groceries("Sugar"));

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair"));

        WarehouseUtil.displayAllItems(electronicsStorage.getItems());
        WarehouseUtil.displayAllItems(groceriesStorage.getItems());
        WarehouseUtil.displayAllItems(furnitureStorage.getItems());
    }
}
