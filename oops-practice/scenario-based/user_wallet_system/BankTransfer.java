package user_wallet_system;

class BankTransfer implements TransferService {

    public void transfer(User from,User to,double amount) throws InsufficientBalanceException {
        double charge = 10;

        if(from.wallet.balance < amount + charge) {
            throw new InsufficientBalanceException("Insufficient Balance for Bank Transfer");
        }

        from.wallet.balance = from.wallet.balance - (amount + charge);
        to.wallet.addMoney(amount);

        from.wallet.transactions.add(new Transaction("BANK TRANSFER SENT",amount));
        from.wallet.transactions.add(new Transaction("BANK CHARGE",charge));
        to.wallet.transactions.add(new Transaction("BANK TRANSFER RECEIVED",amount));
    }
}
