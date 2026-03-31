import java.util.Scanner;

public class FindRoundsAthleteNeedToRun {
	public static int findPerimeter(int a,int b,int c) {
		return a+b+c;
	}
	public static double numberOfRoundsUserNeed(int peri) {
		return 5/peri;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of side a: ");
		int a = sc.nextInt();
		System.out.println("Enter the length of side b: ");
		int b = sc.nextInt();
		System.out.println("Enter the length of side c: ");
		int c = sc.nextInt();
		
		int peri = findPerimeter(a,b,c);
		double round = numberOfRoundsUserNeed(peri);
		System.out.println("Number of rounds user need: "+round);
		sc.close();
	}
}
