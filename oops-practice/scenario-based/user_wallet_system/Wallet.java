package user_wallet_system;

import java.util.ArrayList;

class Wallet {
    double balance;
    ArrayList<Transaction> transactions = new ArrayList<>();

    Wallet() {
        balance = 0;
    }

    void addMoney(double amount) {
        balance = balance + amount;
        transactions.add(new Transaction("ADD",amount));
    }

    void withdrawMoney(double amount) throws InsufficientBalanceException {
        if(balance < amount) {
            throw new InsufficientBalanceException("Insufficient Balance");
        }
        balance = balance - amount;
        transactions.add(new Transaction("WITHDRAW",amount));
    }

    void showTransactions() {
        for(int i = 0;i<transactions.size();i++) {
            transactions.get(i).display();
        }
    }
}
