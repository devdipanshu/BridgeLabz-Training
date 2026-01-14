import java.util.*;

public class ZeroSumSubarray {

    static void findZeroSumSubarrays(int[] arr) {

        Map<Integer, List<Integer>> map = new HashMap<>();
        int sum = 0;

        map.put(0, new ArrayList<>(Arrays.asList(-1)));

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (map.containsKey(sum)) {
                List<Integer> startIndices = map.get(sum);
                for (int start : startIndices) {
                    System.out.print("Subarray: [");
                    for (int k = start + 1; k <= i; k++) {
                        System.out.print(arr[k] + (k < i ? ", " : ""));
                    }
                    System.out.println("]");
                }
            }

            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, -7, 1, 3, 3, 1, -4, -2, -2};
        findZeroSumSubarrays(arr);
    }
}
