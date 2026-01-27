import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    void withdraw(double amount) throws InsufficientBalanceException {
        if(amount < 0) {
            throw new IllegalArgumentException();
        }
        if(amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance!");
        }
        balance = balance - amount;
        System.out.println("Withdrawal successful, new balance: " + balance);
    }
}

public class BankTransaction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            double balance = sc.nextDouble();
            double amount = sc.nextDouble();
            BankAccount acc = new BankAccount(balance);
            acc.withdraw(amount);
        } catch(InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch(IllegalArgumentException e) {
            System.out.println("Invalid amount!");
        } finally {
            sc.close();
        }
    }
}
