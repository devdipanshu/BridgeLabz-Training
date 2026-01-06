class BankAccount{
	private int accountNumber;
	private double balance;
	
	public void deposit(double amount) {
		balance = balance+amount;
	}
	public void withdraw(double amount) {
		balance = balance-amount;
	}
	public double checkBalance() {
		return balance;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	BankAccount(int accountNumber, double balance){
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
}
public class BankAccountManager {
	public static void main(String[] args) {
		BankAccount account = new BankAccount(101,500.0);
		System.out.println("Amount Befor Deposit");
		System.out.println(account.checkBalance());
		System.out.println("Amount After Deposit 500rs");
		account.deposit(500);
		System.out.println(account.checkBalance());
		System.out.println("Amount After Withdraw 200rs");
		account.withdraw(200);
		System.out.println(account.checkBalance());
	}
}
