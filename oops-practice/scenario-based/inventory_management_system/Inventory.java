package inventory_management_system;

import java.util.ArrayList;

class Inventory implements AlertService {

    ArrayList<Product> products = new ArrayList<Product>();

    void addProduct(Product product){

        for(int i = 0;i < products.size();i++){
            Product p = products.get(i);

            if(p.productId == product.productId){
                p.quantity = p.quantity + product.quantity;
                System.out.println("Product exists, quantity updated");
                return;
            }
        }

        products.add(product);
        System.out.println("New product added");
    }

    void updateProduct(int productId,String name,int quantity,double price,int threshold){

        for(int i = 0;i < products.size();i++){
            Product p = products.get(i);

            if(p.productId == productId){
                p.name = name;
                p.quantity = quantity;
                p.price = price;
                p.threshold = threshold;
                System.out.println("Product updated");
                return;
            }
        }
        System.out.println("Product not found");
    }

    void removeProduct(int productId) throws OutOfStockException{

        for(int i = 0;i < products.size();i++){
            Product p = products.get(i);

            if(p.productId == productId){

                if(p.quantity == 0){
                    throw new OutOfStockException("Product already out of stock");
                }

                if(p.quantity <= p.threshold){
                    sendAlert(p);
                }

                products.remove(i);
                System.out.println("Product removed");
                return;
            }
        }
        System.out.println("Product not found");
    }

    void stockMonitoring(){

        ArrayList<Product> lowStockList = new ArrayList<Product>();

        System.out.println("Stock Details:");
        for(int i = 0;i < products.size();i++){
            Product p = products.get(i);

            System.out.println(
                p.productId+"  "+p.name+"  "+p.quantity+
                "  "+p.price+"  Threshold:"+p.threshold
            );

            if(p.quantity <= p.threshold){
                lowStockList.add(p);
            }
        }

        System.out.println("Low Stock Products:");
        for(int i = 0;i < lowStockList.size();i++){
            Product p = lowStockList.get(i);
            System.out.println(p.name+"  Qty:"+p.quantity);
        }
    }

    public void sendAlert(Product product){
        System.out.println(
            "ALERT: Low stock for "+product.name+
            " Remaining Qty: "+product.quantity
        );
    }
}
