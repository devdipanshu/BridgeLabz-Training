import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int celcius_temp = sc.nextInt();
    	int fahrenheit_temp = (celcius_temp*(9/5))+32;
    	System.out.println(fahrenheit_temp);
    }
}
