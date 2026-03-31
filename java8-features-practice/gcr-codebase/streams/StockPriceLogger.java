
import java.util.ArrayList;
import java.util.List;

public class StockPriceLogger {

    public static void main(String[] args) {

        List<Double> stockPrices = new ArrayList<>();

        stockPrices.add(2450.50);
        stockPrices.add(2462.75);
        stockPrices.add(2448.30);
        stockPrices.add(2475.10);
        stockPrices.add(2468.90);

        stockPrices.stream()
        .forEach(price ->
            System.out.println("Live Stock Price : " + price)
        );
    }
}
