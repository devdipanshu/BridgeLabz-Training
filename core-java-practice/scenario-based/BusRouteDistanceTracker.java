import java.util.Scanner;

public class BusRouteDistanceTracker {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true;
		int totalDistance = 0;
		while(flag) {
			totalDistance+=10;
			System.out.println("do you want to get off at this stop(enter yes or no)");
			String consent = sc.next();
			if(consent.equalsIgnoreCase("yes")) {
				flag = false;
			}
		}
		System.out.println("Total distance you travelled is: "+totalDistance);
		sc.close();
	}
}
