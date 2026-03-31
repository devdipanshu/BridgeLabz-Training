import java.util.Scanner;

public class UnitConvertor {
	public static double convertKmToMiles(double km) {
		double km2miles = 0.621371;
		double miles = km * km2miles;
		return miles;
	}
	public static double convertMilesToKm(double miles) {
		double miles2km = 1.60934;
		double km = miles * miles2km;
		return km;
	}
	public static double convertMetersToFeet(double meters) {
		double meters2feet = 3.28084;
		double feet = meters * meters2feet;
		return feet;
	}
	public static double convertFeetToMeters(double feet) {
		double feet2meters = 0.3048;
		double meters = feet * feet2meters;
		return meters;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double km = sc.nextDouble();
		double miles = convertKmToMiles(km);
		System.out.println("Kilometers to Miles is: "+miles);
		
		double milesInput = sc.nextDouble();
		double kmResult = convertMilesToKm(milesInput);
		System.out.println("Miles to Kilometers is: "+kmResult);

		double meters = sc.nextDouble();
		double feet = convertMetersToFeet(meters);
		System.out.println("Meters to Feet is: "+feet);

		double feetInput = sc.nextDouble();
		double metersResult = convertFeetToMeters(feetInput);
		System.out.println("Feet to Meters is: "+metersResult);
		sc.close();
	}
}
