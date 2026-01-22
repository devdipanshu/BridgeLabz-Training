import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyOfElements {

    static Map<String, Integer> findFrequency(ArrayList<String> list) {

        HashMap<String, Integer> freqMap = new HashMap<>();

        for(int i = 0;i < list.size();i++) {

            String key = list.get(i);

            if(freqMap.containsKey(key)) {
                freqMap.put(key, freqMap.get(key) + 1);
            } else {
                freqMap.put(key, 1);
            }
        }

        return freqMap;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter elements:");
        for(int i = 0;i < n;i++) {
            list.add(sc.nextLine());
        }

        Map<String, Integer> result = findFrequency(list);

        for(String key : result.keySet()) {
            System.out.println(key + " = " + result.get(key));
        }
    }
}

