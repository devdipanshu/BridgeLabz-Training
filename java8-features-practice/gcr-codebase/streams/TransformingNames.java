
import java.util.ArrayList;
import java.util.List;

public class TransformingNames {

    public static void main(String[] args) {

        List<String> customers = new ArrayList<>();

        customers.add("dipanshu");
        customers.add("rahul");
        customers.add("aman");
        customers.add("neha");
        customers.add("rohit");

        customers.stream()
        .map(name -> name.toUpperCase())
        .sorted()
        .forEach(name -> System.out.println(name));
    }
}
