import java.time.LocalDate;
import java.util.*;


class Policy implements Comparable<Policy> {

    int policyNumber;
    String policyHolderName;
    LocalDate expiryDate;
    String coverageType;
    double premiumAmount;

    Policy(int policyNumber, String policyHolderName,
           LocalDate expiryDate, String coverageType, double premiumAmount) {

        this.policyNumber = policyNumber;
        this.policyHolderName = policyHolderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    public boolean equals(Object obj) {
        Policy p = (Policy)obj;
        return this.policyNumber == p.policyNumber;
    }

    public int hashCode() {
        return policyNumber;
    }

    public int compareTo(Policy p) {
        return this.expiryDate.compareTo(p.expiryDate);
    }

    public String toString() {
        return policyNumber + " | " + policyHolderName + " | "
                + expiryDate + " | " + coverageType + " | " + premiumAmount;
    }
}
public class InsuranceSystem {

    static void displayAll(Set<Policy> set) {
        for(Policy p : set) {
            System.out.println(p);
        }
    }

    static void expiringSoon(Set<Policy> set) {
        LocalDate today = LocalDate.now();
        LocalDate limit = today.plusDays(30);

        for(Policy p : set) {
            if(!p.expiryDate.isAfter(limit)) {
                System.out.println(p);
            }
        }
    }

    static void filterByCoverage(Set<Policy> set, String type) {
        for(Policy p : set) {
            if(p.coverageType.equalsIgnoreCase(type)) {
                System.out.println(p);
            }
        }
    }

    public static void main(String[] args) {

        Set<Policy> hashSet = new HashSet<>();
        Set<Policy> linkedHashSet = new LinkedHashSet<>();
        Set<Policy> treeSet = new TreeSet<>();

        Policy p1 = new Policy(101, "Amit", LocalDate.now().plusDays(20), "Health", 5000);
        Policy p2 = new Policy(102, "Ravi", LocalDate.now().plusDays(60), "Auto", 3000);
        Policy p3 = new Policy(103, "Neha", LocalDate.now().plusDays(10), "Home", 8000);
        Policy p4 = new Policy(101, "Amit", LocalDate.now().plusDays(20), "Health", 5000); 

        hashSet.add(p1);
        hashSet.add(p2);
        hashSet.add(p3);
        hashSet.add(p4);

        linkedHashSet.addAll(hashSet);
        treeSet.addAll(hashSet);

        System.out.println("---- All Policies (HashSet) ----");
        displayAll(hashSet);

        System.out.println("---- Insertion Order (LinkedHashSet) ----");
        displayAll(linkedHashSet);

        System.out.println("---- Sorted by Expiry Date (TreeSet) ----");
        displayAll(treeSet);

        System.out.println("---- Expiring Within 30 Days ----");
        expiringSoon(hashSet);

        System.out.println("---- Health Coverage Policies ----");
        filterByCoverage(hashSet, "Health");

        Policy searchPolicy = p2;

        long start = System.nanoTime();
        hashSet.contains(searchPolicy);
        System.out.println("HashSet Search Time: " + (System.nanoTime() - start));

        start = System.nanoTime();
        linkedHashSet.contains(searchPolicy);
        System.out.println("LinkedHashSet Search Time: " + (System.nanoTime() - start));

        start = System.nanoTime();
        treeSet.contains(searchPolicy);
        System.out.println("TreeSet Search Time: " + (System.nanoTime() - start));
    }
}
