import java.util.*;
import java.util.stream.*;

class Order{
    String customer;
    double amount;
    Order(String customer,double amount){
        this.customer=customer;
        this.amount=amount;
    }
}

public class OrderRevenueSummary{
    public static void main(String[] args){
        List<Order> orders=new ArrayList<>();
        orders.add(new Order("Amit",1200));
        orders.add(new Order("Amit",800));
        orders.add(new Order("Rohit",1500));
        orders.add(new Order("Rohit",500));

        Map<String,Double> revenue=
            orders.stream()
            .collect(Collectors.groupingBy(
                o->o.customer,
                Collectors.summingDouble(o->o.amount)
            ));

        System.out.println(revenue);
    }
}
