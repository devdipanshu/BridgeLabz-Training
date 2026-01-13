package user_wallet_system;

class User {
    int id;
    String name;
    Wallet wallet;

    User(int id,String name) {
        this.id = id;
        this.name = name;
        wallet = new Wallet();
    }
}
