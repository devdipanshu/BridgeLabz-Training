import java.util.Scanner;

public class CentimetersToFeetAndInches {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double heightInCm = sc.nextDouble();
		double heightInInch = heightInCm/2.54;
		double heightInFeet = heightInInch/12;
		System.out.println("Your Height in cm is "+heightInCm+" while in feet is "+heightInFeet+" and inches is "+heightInInch);
	}
}
