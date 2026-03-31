import java.util.*;

class Patient implements Comparable<Patient> {

    String name;
    int severity;

    Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    public int compareTo(Patient p) {
        return p.severity - this.severity;
    }

    public String toString() {
        return name + " (" + severity + ")";
    }
}

public class HospitalTriage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PriorityQueue<Patient> pq = new PriorityQueue<>();

        System.out.print("Enter number of patients: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0;i < n;i++) {
            System.out.print("Enter patient name: ");
            String name = sc.nextLine();
            System.out.print("Enter severity: ");
            int severity = sc.nextInt();
            sc.nextLine();

            pq.add(new Patient(name, severity));
        }

        System.out.println("Order of treatment:");
        while(!pq.isEmpty()) {
            System.out.println(pq.remove());
        }
    }
}
