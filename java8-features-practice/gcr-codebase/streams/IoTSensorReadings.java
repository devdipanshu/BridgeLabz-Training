
import java.util.ArrayList;
import java.util.List;

public class IoTSensorReadings {

    public static void main(String[] args) {

        List<Double> readings = new ArrayList<>();

        readings.add(22.5);
        readings.add(35.8);
        readings.add(18.2);
        readings.add(42.6);
        readings.add(30.1);

        double threshold = 30.0;

        readings.stream()
        .filter(r -> r > threshold)
        .forEach(r ->
            System.out.println("Alert! Reading above threshold : " + r)
        );
    }
}
