import java.util.ArrayList;
import java.util.Scanner;

interface BankService {
	void deposit(double amount);
	void withdraw(double amount) throws InsufficientBalanceException;
	void transfer(Account toAccount, double amount) throws InsufficientBalanceException;
	double checkBalance();
}

class InsufficientBalanceException extends Exception {
	InsufficientBalanceException(String msg) {
		super(msg);
	}
}

class Transaction {
	private String type;
	private double amount;

	Transaction(String type, double amount) {
		this.type = type;
		this.amount = amount;
	}

	void display() {
		System.out.println("Type: " + type);
		System.out.println("Amount: " + amount);
		System.out.println("--------------------");
	}
}

abstract class Account implements BankService {
	protected int accountNumber;
	protected String holderName;
	protected double balance;
	protected ArrayList<Transaction> history = new ArrayList<>();

	Account(int accountNumber, String holderName, double balance) {
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.balance = balance;
	}

	public synchronized void deposit(double amount) {
		balance = balance + amount;
		history.add(new Transaction("Deposit", amount));
	}

	public synchronized void withdraw(double amount) throws InsufficientBalanceException {
		if(amount > balance) {
			throw new InsufficientBalanceException("Insufficient Balance");
		}
		balance = balance - amount;
		history.add(new Transaction("Withdraw", amount));
	}

	public synchronized void transfer(Account toAccount, double amount) throws InsufficientBalanceException {
		if(amount > balance) {
			throw new InsufficientBalanceException("Insufficient Balance for Transfer");
		}
		this.balance = this.balance - amount;
		toAccount.balance = toAccount.balance + amount;

		history.add(new Transaction("Transfer Sent", amount));
		toAccount.history.add(new Transaction("Transfer Received", amount));
	}

	public double checkBalance() {
		return balance;
	}

	void displayAccountInfo() {
		System.out.println("Account Number: " + accountNumber);
		System.out.println("Holder Name: " + holderName);
		System.out.println("Balance: " + balance);
	}

	void displayTransactionHistory() {
		System.out.println("---- Transaction History ----");
		if(history.size() == 0) {
			System.out.println("No Transactions Yet");
			return;
		}
		for(Transaction t : history) {
			t.display();
		}
	}
}

class SavingsAccount extends Account {
	private double interestRate = 4.0;

	SavingsAccount(int accountNumber, String holderName, double balance) {
		super(accountNumber, holderName, balance);
	}

	void addInterest() {
		double interest = balance * interestRate / 100;
		balance = balance + interest;
		history.add(new Transaction("Interest Added", interest));
	}
}

class CurrentAccount extends Account {

	CurrentAccount(int accountNumber, String holderName, double balance) {
		super(accountNumber, holderName, balance);
	}
}

public class OnlineBankingSystem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Account> accounts = new ArrayList<>();
		int choice = -1;
		while(choice != 0) {

			System.out.println("\nONLINE BANKING SYSTEM");
			System.out.println("1. Create Account");
			System.out.println("2. Deposit");
			System.out.println("3. Withdraw");
			System.out.println("4. Transfer");
			System.out.println("5. Check Balance");
			System.out.println("6. Transaction History");
			System.out.println("0. Exit");

			choice = sc.nextInt();

			switch(choice) {

			case 1:
				System.out.println("1. Savings Account");
				System.out.println("2. Current Account");
				int type = sc.nextInt();

				System.out.println("Enter Account Number:");
				int accNo = sc.nextInt();

				System.out.println("Enter Holder Name:");
				sc.nextLine();
				String name = sc.nextLine();

				System.out.println("Enter Initial Balance:");
				double bal = sc.nextDouble();

				if(type == 1) {
					accounts.add(new SavingsAccount(accNo, name, bal));
				} else {
					accounts.add(new CurrentAccount(accNo, name, bal));
				}

				System.out.println("Account Created Successfully");
				break;

			case 2:
				Account acc1 = findAccount(accounts, sc);
				if(acc1 != null) {
					System.out.println("Enter Amount:");
					double amt = sc.nextDouble();
					acc1.deposit(amt);
					System.out.println("Deposit Successful");
				}
				break;

			case 3:
				Account acc2 = findAccount(accounts, sc);
				if(acc2 != null) {
					System.out.println("Enter Amount:");
					double amt = sc.nextDouble();
					try {
						acc2.withdraw(amt);
						System.out.println("Withdraw Successful");
					} catch(InsufficientBalanceException e) {
						System.out.println(e.getMessage());
					}
				}
				break;

			case 4:
				System.out.println("From Account:");
				Account from = findAccount(accounts, sc);
				System.out.println("To Account:");
				Account to = findAccount(accounts, sc);

				if(from != null && to != null) {
					System.out.println("Enter Amount:");
					double amt = sc.nextDouble();
					try {
						from.transfer(to, amt);
						System.out.println("Transfer Successful");
					} catch(InsufficientBalanceException e) {
						System.out.println(e.getMessage());
					}
				}
				break;

			case 5:
				Account acc3 = findAccount(accounts, sc);
				if(acc3 != null) {
					System.out.println("Balance: " + acc3.checkBalance());
				}
				break;

			case 6:
				Account acc4 = findAccount(accounts, sc);
				if(acc4 != null) {
					acc4.displayTransactionHistory();
				}
				break;

			case 0:
				System.out.println("Thank You for Using Banking System");
				break;

			default:
				System.out.println("Invalid Choice");
			}
		}
	}
	static Account findAccount(ArrayList<Account> list, Scanner sc) {
		System.out.println("Enter Account Number:");
		int no = sc.nextInt();

		for(Account acc : list) {
			if(acc.accountNumber == no) {
				return acc;
			}
		}
		System.out.println("Account Not Found");
		return null;
	}
}
