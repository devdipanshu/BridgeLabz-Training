import java.util.Scanner;

public class UnitConvertor3 {
	public static double convertFarhenheitToCelsius(double farhenheit) {
		double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
		return farhenheit2celsius;
	}
	public static double convertCelsiusToFarhenheit(double celsius) {
		double celsius2farhenheit = (celsius * 9 / 5) + 32;
		return celsius2farhenheit;
	}
	public static double convertPoundsToKilograms(double pounds) {
		double pounds2kilograms = 0.453592;
		double kilograms = pounds * pounds2kilograms;
		return kilograms;
	}
	public static double convertKilogramsToPounds(double kilograms) {
		double kilograms2pounds = 2.20462;
		double pounds = kilograms * kilograms2pounds;
		return pounds;
	}
	public static double convertGallonsToLiters(double gallons) {
		double gallons2liters = 3.78541;
		double liters = gallons * gallons2liters;
		return liters;
	}
	public static double convertLitersToGallons(double liters) {
		double liters2gallons = 0.264172;
		double gallons = liters * liters2gallons;
		return gallons;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double farhenheit = sc.nextDouble();
		double celsius = convertFarhenheitToCelsius(farhenheit);
		System.out.println("Farhenheit to Celsius is: "+celsius);

		double celsiusInput = sc.nextDouble();
		double farhenheitResult = convertCelsiusToFarhenheit(celsiusInput);
		System.out.println("Celsius to Farhenheit is: "+farhenheitResult);

		double pounds = sc.nextDouble();
		double kilograms = convertPoundsToKilograms(pounds);
		System.out.println("Pounds to Kilograms is: "+kilograms);

		double kilogramsInput = sc.nextDouble();
		double poundsResult = convertKilogramsToPounds(kilogramsInput);
		System.out.println("Kilograms to Pounds is: "+poundsResult);

		double gallons = sc.nextDouble();
		double liters = convertGallonsToLiters(gallons);
		System.out.println("Gallons to Liters is: "+liters);

		double litersInput = sc.nextDouble();
		double gallonsResult = convertLitersToGallons(litersInput);
		System.out.println("Liters to Gallons is: "+gallonsResult);
		sc.close();
	}
}
