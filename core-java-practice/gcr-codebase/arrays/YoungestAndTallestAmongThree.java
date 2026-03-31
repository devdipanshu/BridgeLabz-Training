import java.util.Scanner;

public class YoungestAndTallestAmongThree {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] age = new int[3];
		int[] height = new int[3];
		
		for(int i = 0;i<3;i++) {
			
			System.out.println("Enter the age of "+i+"th Freind: ");
			age[i] = sc.nextInt();
			System.out.println("Enter the height of "+i+"th Freind: ");
			height[i] = sc.nextInt();
			
		}
		
		int youngest = 0;
		int tallest = 0;
		
		for(int i = 1;i<3;i++) {
			if(age[i]<age[youngest]) {
				youngest = i;
			}
			if(height[i]>height[tallest]) {
				tallest = i;
			}
		}
		
		System.out.println("Youngest among three is "+(youngest+1)+"th friend");
		System.out.println("tallest among three is "+(tallest+1)+"th friend");
		
		sc.close();
	}
}
