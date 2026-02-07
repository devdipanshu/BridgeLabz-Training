import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
public class TransactionLogger {
    public static void main(String[] args) {
        List<String> transactionIds = new ArrayList<>();
        transactionIds.add("TXN1001");
        transactionIds.add("TXN1002");
        transactionIds.add("TXN1003");
        transactionIds.add("TXN1004");

        transactionIds.forEach(id ->
            System.out.println(
                LocalDateTime.now() + " - Transaction: " + id
            )
        );
    }
}
