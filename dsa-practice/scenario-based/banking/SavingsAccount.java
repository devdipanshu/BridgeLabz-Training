package banking;

public class SavingsAccount extends BankAccount {

	SavingsAccount(String accountNumber,double balance){
		super(accountNumber,balance);
	}

	public double calculateFee(){
		return getBalance() * 0.005;
	}
}
