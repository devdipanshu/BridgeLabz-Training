public class BankAccount2 {
	public int accountNumber;
	protected String accountHolder;
	private double balance;
	
	BankAccount2(int accountNumber, String accountHolder, double balance){
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		setBalance(balance);
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public double getBalance() {
		return this.balance;
	}
}

class SavingsAccount extends BankAccount2 {
	SavingsAccount(int accountNumber, String accountHolder, double balance){
		super(accountNumber, accountHolder, balance);
	}
	public void display() {
		System.out.println("Account Number: "+accountNumber);
		System.out.println("Account Holder: "+accountHolder);
		System.out.println("Balance: "+getBalance());
		System.out.println("------------------------");
	}
	public static void main(String[] args) {
		SavingsAccount account = new SavingsAccount(101,"Dipanshu Sharma",5000.0);
		account.display();
		account.setBalance(8000.0);
		account.display();
	}
}
