import java.util.Scanner;

public class QuickSort {
	public static int partition(int[]arr,int start,int end) {
		int pivot = arr[end];
		int i = start-1;
		for(int j = start;j<=end;j++) {
			if(arr[j]<pivot) {
				i++;
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}
		i++;
		int temp = arr[i];
		arr[i] = arr[end];
		arr[end] = temp;
		return i++;
	}
	public static void quickSort(int[]arr,int start,int end) {
		if(start<end) {
			int pivot = partition(arr,start,end);
			partition(arr,start,pivot-1);
			partition(arr,pivot+1,end);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Products: ");
		int n = sc.nextInt();
		int[] prices = new int[n];
		for(int i = 0;i<n;i++) {
			System.out.println("Enter the Pice of product "+(i+1));
			prices[i] = sc.nextInt();
		}
		System.out.println("Prices before Sorting: ");
		for(int i = 0;i<n;i++) {
			System.out.print(prices[i]+" ");
		}
		System.out.println();
		System.out.println();
		quickSort(prices,0,prices.length-1);
		System.out.println("Prices after Sorting: ");
		for(int i = 0;i<n;i++) {
			System.out.print(prices[i]+" ");
		}
		sc.close();
	}
}
