import java.util.Scanner;

public class MayasBMI {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is Your Weight in Kg: ");
		double weightInKg = sc.nextDouble();
		
		System.out.println("What is Your Height in Meter: ");
		double heightInM = sc.nextDouble();
		
		
		double BMI = weightInKg/(heightInM*heightInM);
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