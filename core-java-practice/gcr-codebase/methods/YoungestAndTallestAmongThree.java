import java.util.Scanner;

public class YoungestAndTallestAmongThree {

	public static int findYoungest(int[] age) {
		int youngest = 0;
		for(int i = 1;i<age.length;i++) {
			if(age[i]<age[youngest]) {
				youngest = i;
			}
		}
		return youngest;
	}

	public static int findTallest(int[] height) {
		int tallest = 0;
		for(int i = 1;i<height.length;i++) {
			if(height[i]>height[tallest]) {
				tallest = i;
			}
		}
		return tallest;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] age = new int[3];
		int[] height = new int[3];

		for(int i = 0;i<3;i++) {
			System.out.println("Enter age of "+(i+1)+"th Friend: ");
			age[i] = sc.nextInt();

			System.out.println("Enter height of "+(i+1)+"th Friend: ");
			height[i] = sc.nextInt();
		}

		int youngest = findYoungest(age);
		int tallest = findTallest(height);

		System.out.println("Youngest among three is "+(youngest+1)+"th friend");
		System.out.println("Tallest among three is "+(tallest+1)+"th friend");

		sc.close();
	}
}

