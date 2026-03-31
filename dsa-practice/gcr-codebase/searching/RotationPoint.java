import java.util.Scanner;

public class RotationPoint{

    public static int findRotationPoint(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while(left < right) {
            int mid = (left + right) / 2;

            if(arr[mid] > arr[right]) {
                
                left = mid + 1;
            } else {
               
                right = mid;
            }
        }

        return left; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements (rotated sorted):");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int rotationIndex = findRotationPoint(arr);

        System.out.println("Rotation point (smallest element) at index: " + rotationIndex);
        System.out.println("Smallest element: " + arr[rotationIndex]);
    }
}
