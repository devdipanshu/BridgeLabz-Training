package user_wallet_system;

class Transaction {
    static int counter = 1;
    int transactionId;
    String type;
    double amount;

    Transaction(String type,double amount) {
        transactionId = counter++;
        this.type = type;
        this.amount = amount;
    }

    void display() {
        System.out.println(transactionId+" "+type+" "+amount);
    }
}
