import java.util.Scanner;

public class BubbleSort {
	public static void sortMarks(int[]marks) {
		for(int i = 0;i<marks.length;i++) {
			for(int j = 0;j<marks.length-1;j++) {
				if(marks[j+1]<marks[j]) {
					int temp = marks[j];
					marks[j] = marks[j+1];
					marks[j+1] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Students: ");
		int n = sc.nextInt();
		int[] marks = new int[n];
		for(int i = 0;i<n;i++) {
			System.out.println("Enter the mark of student "+(i+1));
			marks[i] = sc.nextInt();
		}
		System.out.println("Marks before Sorting: ");
		for(int i = 0;i<n;i++) {
			System.out.print(marks[i]+" ");
		}
		System.out.println();
		System.out.println();
		sortMarks(marks);
		System.out.println("Marks after Sorting: ");
		for(int i = 0;i<n;i++) {
			System.out.print(marks[i]+" ");
		}
		sc.close();
	}
}
