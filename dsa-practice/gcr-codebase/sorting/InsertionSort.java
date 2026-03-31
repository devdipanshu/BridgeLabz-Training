import java.util.Scanner;

public class InsertionSort {
	public static void sortId(int[]id) {
		for(int i = 0;i<id.length;i++) {
			int j = i;
			while(j>0&&id[j-1]>id[j]) {
				int temp = id[j];
				id[j] = id[j-1];
				id[j-1] = temp;
				j--;
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Employees: ");
		int n = sc.nextInt();
		int[] id = new int[n];
		for(int i = 0;i<n;i++) {
			System.out.println("Enter the Id of student "+(i+1));
			id[i] = sc.nextInt();
		}
		System.out.println("Id's before Sorting: ");
		for(int i = 0;i<n;i++) {
			System.out.print(id[i]+" ");
		}
		System.out.println();
		System.out.println();
		sortId(id);
		System.out.println("Id's after Sorting: ");
		for(int i = 0;i<n;i++) {
			System.out.print(id[i]+" ");
		}
		sc.close();
	}
}
