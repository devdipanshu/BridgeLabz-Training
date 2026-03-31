import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BankAccountTest {

    @Test
    void testDeposit() {
        BankAccount account = new BankAccount(1000);
        account.deposit(500);
        assertEquals(1500, account.getBalance());
    }

    @Test
    void testWithdrawSuccess() {
        BankAccount account = new BankAccount(1000);
        account.withdraw(400);
        assertEquals(600, account.getBalance());
    }

    @Test
    void testWithdrawInsufficientBalance() {
        BankAccount account = new BankAccount(500);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(1000);
        });

        assertEquals("Insufficient balance", exception.getMessage());
    }

    @Test
    void testNegativeDeposit() {
        BankAccount account = new BankAccount(1000);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.deposit(-100);
        });

        assertEquals("Deposit amount cannot be negative", exception.getMessage());
    }

    @Test
    void testNegativeWithdraw() {
        BankAccount account = new BankAccount(1000);

        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            account.withdraw(-100);
        });

        assertEquals("Withdraw amount cannot be negative", exception.getMessage());
    }
}
