import java.util.Scanner;

public class CalculateBMI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double weightInKg = sc.nextDouble();
		double heightInCm = sc.nextDouble();
		double heightInM = heightInCm/100;
		
		double BMI = weightInKg/(heightInM*heightInM);
		if(BMI<=18.4) {
			System.out.println("Status: Underweight");
		}
		if(BMI<=18.4) {
			System.out.println("Status: Underweight");
		}
		else if(BMI>18.4 && BMI<=24.9) {
			System.out.println("Status: Normal");
		}
		else if(BMI>25 && BMI<=39.9) {
			System.out.println("Status: Overweight");
		}
		else {
			System.out.println("Status: Obese");
		}
		
		sc.close();
	}
}
