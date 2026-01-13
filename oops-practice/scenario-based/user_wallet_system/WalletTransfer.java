package user_wallet_system;

class WalletTransfer implements TransferService {

    public void transfer(User from,User to,double amount) throws InsufficientBalanceException {
        from.wallet.withdrawMoney(amount);
        to.wallet.addMoney(amount);

        from.wallet.transactions.add(new Transaction("WALLET TRANSFER SENT",amount));
        to.wallet.transactions.add(new Transaction("WALLET TRANSFER RECEIVED",amount));
    }
}
