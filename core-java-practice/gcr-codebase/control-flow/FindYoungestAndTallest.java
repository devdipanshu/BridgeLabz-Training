import java.util.Scanner;

public class FindYoungestAndTallest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int amarAge = sc.nextInt();
		int amarHeight = sc.nextInt();
		
		int akbarAge = sc.nextInt();
		int akbarHeight = sc.nextInt();
		
		int anthonyAge = sc.nextInt();
		int anthonyHeight = sc.nextInt();
		
		if(amarAge<akbarAge && amarAge<anthonyAge) {
			System.out.println("amar is the youngest of the three friends");
		}
		
		else if(akbarAge<amarAge && akbarAge<anthonyAge) {
			System.out.println("akbar is the youngest of the three friends");
		}
		
		else {
			System.out.println("anthony is the youngest of the three friends");
		}
		
		
		if(amarHeight>akbarHeight && amarHeight>anthonyHeight) {
			System.out.println("amar is the tallest of the three friends");
		}
		
		else if(akbarHeight>amarHeight && akbarHeight>anthonyHeight) {
			System.out.println("akbar is the tallest of the three friends");
		}
		
		else {
			System.out.println("anthony is the tallest of the three friends");
		}
		
		sc.close();
	}
}
