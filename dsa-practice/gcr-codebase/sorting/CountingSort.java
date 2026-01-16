import java.util.Scanner;

public class CountingSort {

	public static void countingSort(int[] arr, int n) {
		int minAge = 10;
		int maxAge = 18;
		int range = maxAge - minAge + 1;

		int[] count = new int[range];

		for(int i = 0;i < n;i++) {
			count[arr[i] - minAge]++;
		}

		int index = 0;
		for(int i = 0;i < range;i++) {
			while(count[i] > 0) {
				arr[index] = i + minAge;
				index++;
				count[i]--;
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of students:");
		int n = sc.nextInt();

		int[] ages = new int[n];
		int validCount = 0;

		for(int i = 0;i < n;i++) {
			System.out.println("Enter age of student " + (i+1));
			int age = sc.nextInt();

			if(age >= 10 && age <= 18) {
				ages[validCount] = age;
				validCount++;
			} else {
				System.out.println("Invalid age ignored: " + age);
			}
		}

		System.out.println("Valid ages before sorting:");
		for(int i = 0;i < validCount;i++) {
			System.out.print(ages[i] + " ");
		}

		System.out.println();
		System.out.println();

		countingSort(ages, validCount);

		System.out.println("Valid ages after sorting:");
		for(int i = 0;i < validCount;i++) {
			System.out.print(ages[i] + " ");
		}

		sc.close();
	}
}

