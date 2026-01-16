import java.util.Scanner;

public class SelectionSort {
	public static void sortScores(int[]arr) {
		for(int i = 0;i<arr.length;i++) {
			int min = i;
			for(int j = i+1;j<arr.length;j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Students: ");
		int n = sc.nextInt();
		int[] marks = new int[n];
		for(int i = 0;i<n;i++) {
			System.out.println("Enter the mark for students "+(i+1));
			marks[i] = sc.nextInt();
		}
		System.out.println("Marks before Sorting: ");
		for(int i = 0;i<n;i++) {
			System.out.print(marks[i]+" ");
		}
		System.out.println();
		System.out.println();
		sortScores(marks);
		System.out.println("Marks after Sorting: ");
		for(int i = 0;i<n;i++) {
			System.out.print(marks[i]+" ");
		}
		sc.close();
	}
}
