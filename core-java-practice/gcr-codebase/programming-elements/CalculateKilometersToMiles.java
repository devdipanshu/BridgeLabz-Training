import java.util.Scanner;

public class CalculateKilometersToMiles {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		double distanceInKm = sc.nextDouble();
		double distanceInMiles = distanceInKm*0.621371;
		System.out.println(distanceInMiles);
		sc.close();
	}
}
	
		