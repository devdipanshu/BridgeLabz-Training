import java.util.Scanner;

public class CalculateKilometersToMiles {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		double distance_in_km = sc.nextDouble();
		double distance_in_miles = distance_in_km*0.621371;
		System.out.println(distance_in_miles);
	}
}
	
		