package encapsulation_inheritance_polymorphism;

interface Loanable {
    void applyForLoan();
    int calculateLoanEligibility();
}

abstract class BankAccount {

    private int accountNumber;
    private String holderName;
    private int balance;

    abstract int calculateInterest();

    BankAccount(int accountNumber,String holderName,int balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Amount Deposited: "+amount);
    }

    public void withdraw(int amount) {
        if(amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount Withdrawn: "+amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }

    public int getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getHolderName() {
        return holderName;
    }
}

class SavingsAccount extends BankAccount implements Loanable {

    SavingsAccount(int accountNumber,String holderName,int balance) {
        super(accountNumber,holderName,balance);
    }

    int calculateInterest() {
        int interest = getBalance()*4/100;   // 4% interest
        return interest;
    }

    public void applyForLoan() {
        System.out.println("Loan Applied for Savings Account");
    }

    public int calculateLoanEligibility() {
        int eligibility = getBalance()*2;
        return eligibility;
    }
}

class CurrentAccount extends BankAccount implements Loanable {

    CurrentAccount(int accountNumber,String holderName,int balance) {
        super(accountNumber,holderName,balance);
    }

    int calculateInterest() {
        int interest = getBalance()*2/100;   // 2% interest
        return interest;
    }

    public void applyForLoan() {
        System.out.println("Loan Applied for Current Account");
    }

    public int calculateLoanEligibility() {
        int eligibility = getBalance()*3;
        return eligibility;
    }
}

public class BankingSystem {

    public static void processAccounts(BankAccount[] list) {
        for(int i = 0;i<list.length;i++) {
            int interest = list[i].calculateInterest();
            System.out.println("Interest: "+interest);
            Loanable l = (Loanable)list[i];
            l.applyForLoan();
            System.out.println("Loan Eligibility: "+l.calculateLoanEligibility());
            System.out.println();
        }
    }

    public static void main(String[] args) {

        BankAccount b1 = new SavingsAccount(101,"Amit",10000);
        BankAccount b2 = new CurrentAccount(102,"Rahul",20000);
        BankAccount[] accounts = {b1,b2};
        processAccounts(accounts);
    }
}
