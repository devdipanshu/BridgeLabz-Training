package inventory_management_system;

class OutOfStockException extends Exception {
    OutOfStockException(String msg){
        super(msg);
    }
}
