import java.util.Date;

class BankAccount{

    int balance=10000;

    synchronized void withdraw(String name,int amount){
        System.out.println("["+name+"] Attempting to withdraw "+amount);
        if(balance>=amount){
            try{
                Thread.sleep(500);
            }catch(Exception e){}
            balance-=amount;
            System.out.println("Transaction successful: "+name+
            ", Amount: "+amount+
            ", Balance: "+balance+
            ", Time: "+new Date());
        }else{
            System.out.println("Transaction failed: "+name+
            ", Amount: "+amount+
            ", Balance: "+balance+
            ", Time: "+new Date());
        }
    }
}

class Transaction implements Runnable{

    BankAccount account;
    String customer;
    int amount;

    Transaction(BankAccount account,String customer,int amount){
        this.account=account;
        this.customer=customer;
        this.amount=amount;
    }

    public void run(){
        account.withdraw(customer,amount);
    }
}

public class BankingSystem{
    public static void main(String[] args) throws Exception{

        BankAccount account=new BankAccount();

        Thread t1=new Thread(new Transaction(account,"Customer-1",3000));
        Thread t2=new Thread(new Transaction(account,"Customer-2",4000));
        Thread t3=new Thread(new Transaction(account,"Customer-3",2000));
        Thread t4=new Thread(new Transaction(account,"Customer-4",5000));
        Thread t5=new Thread(new Transaction(account,"Customer-5",1500));

        System.out.println("Thread States Before Start:");
        System.out.println(t1.getState());
        System.out.println(t2.getState());
        System.out.println(t3.getState());
        System.out.println(t4.getState());
        System.out.println(t5.getState());

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();

        System.out.println("All transactions processed");
    }
}
