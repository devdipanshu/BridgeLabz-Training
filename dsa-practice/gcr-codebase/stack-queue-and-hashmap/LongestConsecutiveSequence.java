import java.util.HashSet;

public class LongestConsecutiveSequence {

    static int longestConsecutive(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) set.add(num);

        int maxLen = 0;

        for (int num : arr) {
            if (!set.contains(num - 1)) {
                int current = num;
                int length = 1;

                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }

                if (length > maxLen) maxLen = length;
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest consecutive sequence length: " + longestConsecutive(arr));
    }
}
