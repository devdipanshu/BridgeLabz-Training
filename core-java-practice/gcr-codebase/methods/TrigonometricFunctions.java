import java.util.Scanner;

public class TrigonometricFunctions {
	public static double[] calculateTrigonometricFunctions(double angle) {
		double radians = Math.toRadians(angle);
		double sinValue = Math.sin(radians);
		double cosValue = Math.cos(radians);
		double tanValue = Math.tan(radians);
		double[] result = new double[3];
		result[0] = sinValue;
		result[1] = cosValue;
		result[2] = tanValue;
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double angle = sc.nextDouble();
		double[] result = calculateTrigonometricFunctions(angle);
		System.out.println("Sine value is: "+result[0]);
		System.out.println("Cosine value is: "+result[1]);
		System.out.println("Tangent value is: "+result[2]);
		sc.close();
	}
}
