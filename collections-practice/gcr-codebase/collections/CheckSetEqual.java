import java.util.*;

import java.util.*;

class CheckSetEqual {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        System.out.print("Enter size of Set1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter elements of Set1:");
        for(int i = 0;i < n1;i++) {
            set1.add(sc.nextInt());
        }
        System.out.print("Enter size of Set2: ");
        int n2 = sc.nextInt();
        System.out.println("Enter elements of Set2:");
        for(int i = 0;i < n2;i++) {
            set2.add(sc.nextInt());
        }
        if(set1.equals(set2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}

