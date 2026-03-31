import java.util.Scanner;

public class BMIOfAllPersonInATeam {

	public static String[][] findBMI(double weight, double height){
		double heightInM = height/100.0;
		double bmi = weight/(heightInM*heightInM);

		String status = "";
		if(bmi < 18.5) {
			status = "Underweight";
		}
		else if(bmi < 25) {
			status = "Normal";
		}
		else if(bmi < 30) {
			status = "Overweight";
		}
		else {
			status = "Obese";
		}

		String[][] result = new String[1][2];
		result[0][0] = String.valueOf(bmi);
		result[0][1] = status;
		return result;
	}

	public static String[][] details(double[][] weightAndHeight){
		String[][] result = new String[10][4];

		for(int i = 0;i<10;i++) {
			double weight = weightAndHeight[i][0];
			double height = weightAndHeight[i][1];

			String[][] bmiResult = findBMI(weight,height);

			result[i][0] = String.valueOf(weight);
			result[i][1] = String.valueOf(height);
			result[i][2] = bmiResult[0][0];
			result[i][3] = bmiResult[0][1];
		}
		return result;
	}

	public static void display(String[][] result) {
		System.out.println("Weight   Height   BMI   Status");
		for(int i = 0;i<result.length;i++) {
			System.out.println(
				result[i][0]+"     "+
				result[i][1]+"     "+
				result[i][2]+"     "+
				result[i][3]
			);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[][] details = new double[10][2];

		for(int i = 0;i<10;i++) {
			System.out.println("Enter the weight of person "+(i+1)+" in kg");
			details[i][0] = sc.nextDouble();
			System.out.println("Enter the height of person "+(i+1)+" in cm");
			details[i][1] = sc.nextDouble();
		}

		String[][] result = details(details);
		display(result);
		sc.close();
	}
}

