class BankAccount{
	int accountNumber;
	double balance;
	BankAccount(int accountNumber,double balance){
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
}
 
class SavingsAccount extends BankAccount{
	int interestRate;
	SavingsAccount(int accountNumber,double balance,int interestRate){
		super(accountNumber,balance);
		this.interestRate = interestRate;
	}
	void displayAccountType(){
		System.out.println("Account Type: Saving Account");
	}
}
class CheckingAccount extends BankAccount{
	int withdrawalLimit;
	CheckingAccount(int accountNumber,double balance,int withdrawlLimit){
		super(accountNumber,balance);
		this.withdrawalLimit = withdrawlLimit;
	}
	void displayAccountType(){
		System.out.println("Account Type: Checking Account");
	}
}
class FixedDepositAccount extends BankAccount{
	int minimumBalance;
	FixedDepositAccount(int accountNumber,double balance,int minimumBalance){
		super(accountNumber,balance);
		this.minimumBalance = minimumBalance;
	}
	void displayAccountType(){
		System.out.println("Account Type: Fixed Deposit Account");
	}
}
public class BankAccountTypes {
	public static void main(String[] args) {
		SavingsAccount sa = new SavingsAccount(101,200.50,10);
		CheckingAccount ca = new CheckingAccount(101,200.50,50000);
		FixedDepositAccount fda = new FixedDepositAccount(101,200.50,1000);
		sa.displayAccountType();
		ca.displayAccountType();
		fda.displayAccountType();
	}
}
