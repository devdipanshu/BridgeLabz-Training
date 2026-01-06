import java.util.ArrayList;
import java.util.Scanner;

class FindKthPositive {
    public static int findKthPositive(int[] arr, int k) {
        int c = 0;
        int val = 1;
        int i = 0;
        ArrayList<Integer> ls = new ArrayList<Integer>();
        while(c < k){
            if(i < arr.length && arr[i] != val){
                ls.add(val);
                c++;
            }
            else if(i < arr.length && arr[i] == val){
                i++;
            }
            else{
                ls.add(val);
                c++;
            }
            val++;
        }
        return ls.get(k-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            System.out.print("Enter element "+(i+1)+": ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter k: ");
        int k = sc.nextInt();
        int ans = findKthPositive(arr, k);
        System.out.println("Kth missing positive number: " + ans);
        sc.close();
    }
}
