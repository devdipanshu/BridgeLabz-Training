package inventory_management_system;

class Main {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();

        Product p1 = new Product(1,"Mouse",10,500,5);
        Product p2 = new Product(2,"Keyboard",3,800,4);

        inventory.addProduct(p1);
        inventory.addProduct(p2);

        inventory.addProduct(new Product(1,"Mouse",5,500,5));

        inventory.updateProduct(2,"Keyboard",2,750,4);

        inventory.stockMonitoring();

        try{
            inventory.removeProduct(2);
        }
        catch(OutOfStockException e){
            System.out.println(e.getMessage());
        }
    }
}
