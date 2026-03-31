package banking;

public class CheckingAccount extends BankAccount {

	CheckingAccount(String accountNumber,double balance){
		super(accountNumber,balance);
	}

	public double calculateFee(){
		if(getBalance() < 1000){
			return 1.0;
		}
		return 0.0;
	}
}
