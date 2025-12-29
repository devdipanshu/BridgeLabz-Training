import java.util.Scanner;

public class TemperatureConverter {
	public static double[] takeInputs() {
		Scanner sc = new Scanner(System.in);
		double[] inputs = new double[2];
		System.out.println("Enter temperature value: ");
		inputs[0] = sc.nextDouble();
		System.out.println("Enter choice 1 for Celsius to Fahrenheit, 2 for Fahrenheit to Celsius: ");
		inputs[1] = sc.nextInt();
		sc.close();
		return inputs;
	}
	public static double convertCelsiusToFahrenheit(double celsius) {
		double fahrenheit = (celsius*9/5)+32;
		return fahrenheit;
	}
	public static double convertFahrenheitToCelsius(double fahrenheit) {
		double celsius = (fahrenheit-32)*5/9;
		return celsius;
	}
	public static void displayResult(double result,int choice) {
		if(choice == 1) {
			System.out.println("The Result of Temperature in Fahrenheit is: "+result);
		}
		else {
			System.out.println("The Result of Temperature in Celsius is: "+result);
		}
	}
	public static void main(String[] args) {
		double[] inputs = takeInputs();
		double result;
		if(inputs[1] == 1) {
			result = convertCelsiusToFahrenheit(inputs[0]);
		}
		else {
			result = convertFahrenheitToCelsius(inputs[0]);
		}
		displayResult(result,(int)inputs[1]);
	}
}
