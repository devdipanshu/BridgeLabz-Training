import java.util.Arrays;
import java.util.Random;

public class LinearSearchVsBinarySearch {

    static int linearSearch(int[] arr,int target){
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    static int binarySearch(int[] arr,int target){
        int low = 0;
        int high = arr.length - 1;

        while(low <= high){
            int mid = (low + high)/2;

            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] < target){
                low = mid + 1;
            }else{
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args){

        int n = 1000000;
        int[] data = new int[n];
        Random r = new Random();

        for(int i = 0;i<n;i++){
            data[i] = r.nextInt(n);
        }

        int target = data[n - 1];

        long startLinear = System.nanoTime();
        linearSearch(data,target);
        long endLinear = System.nanoTime();

        System.out.println("Linear Search Time (ns): " + (endLinear - startLinear));

        Arrays.sort(data);

        long startBinary = System.nanoTime();
        binarySearch(data,target);
        long endBinary = System.nanoTime();
        
        System.out.println("Binary Search Time (ns): " + (endBinary - startBinary));
    }
}
