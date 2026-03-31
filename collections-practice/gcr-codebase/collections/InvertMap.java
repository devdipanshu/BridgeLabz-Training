import java.util.*;

public class InvertMap {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> map = new HashMap<>();
        System.out.print("Enter number of entries: ");
        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0;i < n;i++) {
            System.out.print("Enter key: ");
            String key = sc.nextLine();
            System.out.print("Enter value: ");
            int value = sc.nextInt();
            sc.nextLine();
            map.put(key, value);
        }

        HashMap<Integer, ArrayList<String>> inverted = new HashMap<>();

        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            int value = entry.getValue();
            String key = entry.getKey();
            if(!inverted.containsKey(value)) {
                inverted.put(value, new ArrayList<>());
            }
            inverted.get(value).add(key);
        }

        for(Integer key : inverted.keySet()) {
            System.out.println(key + "=" + inverted.get(key));
        }
        sc.close();
    }
}
