public class BankAccount {
	String accountHolder;
	int accountNumber;
	int balance;
	
	BankAccount(String accountHolder,int accountNumber,int balance){
		this.accountHolder = accountHolder;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public void depositMoney(int money) {
		this.balance = this.balance+money;
		System.out.println("Deposited: "+money);
	}
	public void withdrawMoney(int money,int accountNumber) {
		if(accountNumber == this.accountNumber) {
			if(money<=this.balance) {
				this.balance-=money;
				System.out.println("Withdraw amount is: "+money);
			}
			else {
			    System.out.println("Insufficient balance");	
			}
		}
		else {
			System.out.println("Account number mismatch");
		}
	}
	public void displayCurrentBalance() {
		System.out.println("Current balance is: "+this.balance);
	}
	public static void main(String[] args) {
		BankAccount account = new BankAccount("Dipanshu Sharma",9761,700);
		account.displayCurrentBalance();
		account.depositMoney(200);
		account.displayCurrentBalance();
		account.withdrawMoney(100, 9761);
		account.displayCurrentBalance();
		account.withdrawMoney(250000, 9761);
	}
}
