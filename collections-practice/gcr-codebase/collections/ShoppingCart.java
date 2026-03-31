import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {

        HashMap<String,Integer> priceMap = new HashMap<String,Integer>();
        priceMap.put("Apple",100);
        priceMap.put("Banana",40);
        priceMap.put("Milk",60);
        priceMap.put("Bread",50);

        LinkedHashMap<String,Integer> cart = new LinkedHashMap<String,Integer>();
        cart.put("Apple",priceMap.get("Apple"));
        cart.put("Milk",priceMap.get("Milk"));
        cart.put("Bread",priceMap.get("Bread"));

        TreeMap<Integer,String> sortedMap = new TreeMap<Integer,String>();

        for(String key : cart.keySet()) {
            int price = cart.get(key);
            sortedMap.put(price,key);
        }

        for(Integer price : sortedMap.keySet()) {
            System.out.println(sortedMap.get(price)+" = "+price);
        }
    }
}

