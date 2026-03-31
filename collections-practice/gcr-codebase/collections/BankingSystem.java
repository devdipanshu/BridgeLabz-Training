import java.util.*;

public class BankingSystem {
    public static void main(String[] args) {

        HashMap<Integer,Integer> accountMap = new HashMap<Integer,Integer>();
        accountMap.put(101,5000);
        accountMap.put(102,3000);
        accountMap.put(103,8000);
        Queue<Integer> withdrawQueue = new LinkedList<Integer>();
        withdrawQueue.add(101);
        withdrawQueue.add(102);
        while(!withdrawQueue.isEmpty()) {
            int accNo = withdrawQueue.remove();
            int balance = accountMap.get(accNo);
            int withdrawAmount = 1000;

            if(balance >= withdrawAmount) {
                accountMap.put(accNo,balance - withdrawAmount);
            }
        }
        TreeMap<Integer,Integer> sortedByBalance = new TreeMap<Integer,Integer>();

        for(Integer accNo : accountMap.keySet()) {
            int balance = accountMap.get(accNo);
            sortedByBalance.put(balance,accNo);
        }
        for(Integer balance : sortedByBalance.keySet()) {
            System.out.println("Account "+sortedByBalance.get(balance)+" Balance "+balance);
        }
    }
}
