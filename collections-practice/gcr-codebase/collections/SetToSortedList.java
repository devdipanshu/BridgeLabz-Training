import java.util.*;

class SetToSortedList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Integer> set = new HashSet<>();

        System.out.print("Enter size of set: ");
        int n = sc.nextInt();

        System.out.println("Enter elements:");
        for(int i = 0;i < n;i++) {
            set.add(sc.nextInt());
        }

        ArrayList<Integer> list = new ArrayList<>(set);
        Collections.sort(list);

        System.out.println("Sorted List: " + list);
    }
}
