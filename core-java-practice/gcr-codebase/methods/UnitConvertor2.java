import java.util.Scanner;

public class UnitConvertor2 {
	public static double convertYardsToFeet(double yards) {
		double yards2feet = 3;
		double feet = yards * yards2feet;
		return feet;
	}
	public static double convertFeetToYards(double feet) {
		double feet2yards = 0.333333;
		double yards = feet * feet2yards;
		return yards;
	}
	public static double convertMetersToInches(double meters) {
		double meters2inches = 39.3701;
		double inches = meters * meters2inches;
		return inches;
	}
	public static double convertInchesToMeters(double inches) {
		double inches2meters = 0.0254;
		double meters = inches * inches2meters;
		return meters;
	}
	public static double convertInchesToCentimeters(double inches) {
		double inches2cm = 2.54;
		double cm = inches * inches2cm;
		return cm;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double yards = sc.nextDouble();
		double feet = convertYardsToFeet(yards);
		System.out.println("Yards to Feet is: "+feet);

		double feetInput = sc.nextDouble();
		double yardsResult = convertFeetToYards(feetInput);
		System.out.println("Feet to Yards is: "+yardsResult);

		double meters = sc.nextDouble();
		double inches = convertMetersToInches(meters);
		System.out.println("Meters to Inches is: "+inches);

		double inchesInput = sc.nextDouble();
		double metersResult = convertInchesToMeters(inchesInput);
		System.out.println("Inches to Meters is: "+metersResult);

		double inchesValue = sc.nextDouble();
		double cm = convertInchesToCentimeters(inchesValue);
		System.out.println("Inches to Centimeters is: "+cm);
		sc.close();
	}
}
