package user_wallet_system;

public class Main {
    public static void main(String[] args) {

        User u1 = new User(1,"Rahul");
        User u2 = new User(2,"Amit");

        u1.wallet.addMoney(1000);

        TransferService walletTransfer = new WalletTransfer();
        TransferService bankTransfer = new BankTransfer();

        try {
            walletTransfer.transfer(u1,u2,300);
            bankTransfer.transfer(u1,u2,500);
            u1.wallet.withdrawMoney(500);
        }
        catch(InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Rahul Balance : "+u1.wallet.balance);
        System.out.println("Amit Balance : "+u2.wallet.balance);

        System.out.println("Rahul Transactions:");
        u1.wallet.showTransactions();

        System.out.println("Amit Transactions:");
        u2.wallet.showTransactions();
    }
}
