import java.util.Random;

public class SortingComparison {

    static void bubbleSort(int[] arr){
        int n = arr.length;

        for(int i = 0;i<n;i++){
            for(int j = 0;j<n-1-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    static void mergeSort(int[] arr,int left,int right){
        if(left < right){
            int mid = (left + right) / 2;
            mergeSort(arr,left,mid);
            mergeSort(arr,mid+1,right);
            merge(arr,left,mid,right);
        }
    }

    static void merge(int[] arr,int left,int mid,int right){
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for(int i = 0;i<n1;i++){
            L[i] = arr[left + i];
        }

        for(int j = 0;j<n2;j++){
            R[j] = arr[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while(i < n1 && j < n2){
            if(L[i] <= R[j]){
                arr[k] = L[i];
                i++;
            }else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while(i < n1){
            arr[k] = L[i];
            i++;
            k++;
        }

        while(j < n2){
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    static void quickSort(int[] arr,int low,int high){
        if(low < high){
            int p = partition(arr,low,high);
            quickSort(arr,low,p-1);
            quickSort(arr,p+1,high);
        }
    }

    static int partition(int[] arr,int low,int high){
        int pivot = arr[high];
        int i = low - 1;

        for(int j = low;j<high;j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }

    public static void main(String[] args){

        int n = 10000;
        int[] data1 = new int[n];
        int[] data2 = new int[n];
        int[] data3 = new int[n];

        Random r = new Random();

        for(int i = 0;i<n;i++){
            int val = r.nextInt(n);
            data1[i] = val;
            data2[i] = val;
            data3[i] = val;
        }

        long startBubble = System.nanoTime();
        bubbleSort(data1);
        long endBubble = System.nanoTime();

        System.out.println("Bubble Sort Time (ns): " + (endBubble - startBubble));

        long startMerge = System.nanoTime();
        mergeSort(data2,0,data2.length-1);
        long endMerge = System.nanoTime();

        System.out.println("Merge Sort Time (ns): " + (endMerge - startMerge));

        long startQuick = System.nanoTime();
        quickSort(data3,0,data3.length-1);
        long endQuick = System.nanoTime();

        System.out.println("Quick Sort Time (ns): " + (endQuick - startQuick));
    }
}
