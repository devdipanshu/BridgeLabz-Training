package dynamiconlinemarketplace;

import java.util.ArrayList;

class ProductCatalog {

    ArrayList<Product<?>> list = new ArrayList<>();

    void addProduct(Product<?> p) {
        list.add(p);
    }

    void showAll() {
        for(int i = 0;i < list.size();i++) {
            list.get(i).display();
        }
    }
}
