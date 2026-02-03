import com.google.gson.Gson;

class Car {
    String brand;
    String model;
    int price;
}

public class CarToJson {
    public static void main(String[] args) {

        Car c = new Car();
        c.brand = "Toyota";
        c.model = "Fortuner";
        c.price = 3500000;

        Gson gson = new Gson();
        String json = gson.toJson(c);

        System.out.println(json);
    }
}
