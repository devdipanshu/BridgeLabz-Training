import java.util.*;

public class MergeTwoMaps {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        System.out.print("Enter size of Map1: ");
        int n1 = sc.nextInt();
        sc.nextLine();

        for(int i = 0;i < n1;i++) {
            System.out.print("Enter key: ");
            String key = sc.nextLine();
            System.out.print("Enter value: ");
            int value = sc.nextInt();
            sc.nextLine();
            map1.put(key, value);
        }

        System.out.print("Enter size of Map2: ");
        int n2 = sc.nextInt();
        sc.nextLine();

        for(int i = 0;i < n2;i++) {
            System.out.print("Enter key: ");
            String key = sc.nextLine();
            System.out.print("Enter value: ");
            int value = sc.nextInt();
            sc.nextLine();
            map2.put(key, value);
        }

        HashMap<String, Integer> result = new HashMap<>();

        for(String key : map1.keySet()) {
            result.put(key, map1.get(key));
        }

        for(String key : map2.keySet()) {
            if(result.containsKey(key)) {
                result.put(key, result.get(key) + map2.get(key));
            } else {
                result.put(key, map2.get(key));
            }
        }

        for(String key : result.keySet()) {
            System.out.println(key + "=" + result.get(key));
        }
    }
}
