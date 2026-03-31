import java.util.Scanner;
import java.util.Arrays;

public class LinearBinaryChallenge {

    public static int firstMissingPositive(int[] arr) {
        int n = arr.length;

        for(int i = 0; i < n; i++) {
            if(arr[i] <= 0 || arr[i] > n) {
                arr[i] = n + 1;
            }
        }
        for(int i = 0; i < n; i++) {
            int val = Math.abs(arr[i]);
            if(val <= n) {
                arr[val - 1] = -Math.abs(arr[val - 1]);
            }
        }

        for(int i = 0; i < n; i++) {
            if(arr[i] > 0) {
                return i + 1;
            }
        }

        return n + 1;
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while(left <= right) {
            int mid = (left + right) / 2;

            if(arr[mid] == target) {
                return mid;
            } else if(arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int missing = firstMissingPositive(Arrays.copyOf(arr, n));
        System.out.println("First missing positive: " + missing);

        Arrays.sort(arr);
        System.out.println("Enter target value to search:");
        int target = sc.nextInt();
        int index = binarySearch(arr, target);

        if(index != -1) {
            System.out.println("Target found at index: " + index);
        } else {
            System.out.println("Target not found in array.");
        }
    }
}
