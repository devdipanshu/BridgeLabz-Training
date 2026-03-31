package smartwarehousemanagement;

import java.util.List;

class WarehouseUtil {

    static void displayAllItems(List<? extends WarehouseItem> list) {

        for(WarehouseItem item : list) {
            item.display();
        }
    }
}
