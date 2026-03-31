import java.util.Scanner;

public class FindPeakElement {

    public static int findPeakElement(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while(left <= right) {
            int mid = (left + right) / 2;

            boolean leftSmaller = (mid == 0) || (arr[mid] > arr[mid - 1]);
            boolean rightSmaller = (mid == arr.length - 1) || (arr[mid] > arr[mid + 1]);

            if(leftSmaller && rightSmaller) {
                return mid;
            } else if(mid > 0 && arr[mid] < arr[mid - 1]) {
                right = mid - 1;
            } else {
                left = mid + 1;
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

        int peakIndex = findPeakElement(arr);

        if(peakIndex != -1) {
            System.out.println("Peak element at index: " + peakIndex);
            System.out.println("Peak element: " + arr[peakIndex]);
        } else {
            System.out.println("No peak element found.");
        }
    }
}
