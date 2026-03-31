import java.util.Scanner;

public class MergeSort {
	public static void mergeSort(int[]prices,int start,int end) {
		if(start<end) {
			int mid = (start+end)/2;
			mergeSort(prices,start,mid);
			mergeSort(prices,mid+1,end);
			merge(prices,start,mid,end);
		}
	}
	public static void merge(int[]arr,int start,int mid,int end) {
		int n1 = mid-start+1;
		int n2 = end-mid;
		int[]left = new int[n1];
		int[]right = new int[n2];
		int i = 0;
		int j =0;
		for(;i<n1;i++) {
			left[i] = arr[start+i];
		}
		for(;j<n2;j++) {
			right[j] = arr[mid+1+j];
		}
		int k = start;
		i = 0;
		j = 0;
		while(i<left.length && j<right.length) {
			if(left[i]<right[j]) {
				arr[k] = left[i];
				i++;
				k++;
			}
			else {
				arr[k] = right[j];
				j++;
				k++;
			}
		}
		while(i<left.length) {
			arr[k++] = left[i++];
		}
		while(j<right.length) {
			arr[k++] = right[j++];
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Books: ");
		int n = sc.nextInt();
		int[] prices = new int[n];
		for(int i = 0;i<n;i++) {
			System.out.println("Enter the Pice of Book "+(i+1));
			prices[i] = sc.nextInt();
		}
		System.out.println("Prices before Sorting: ");
		for(int i = 0;i<n;i++) {
			System.out.print(prices[i]+" ");
		}
		System.out.println();
		System.out.println();
		mergeSort(prices,0,prices.length-1);
		System.out.println("Prices after Sorting: ");
		for(int i = 0;i<n;i++) {
			System.out.print(prices[i]+" ");
		}
		sc.close();
	}
}
