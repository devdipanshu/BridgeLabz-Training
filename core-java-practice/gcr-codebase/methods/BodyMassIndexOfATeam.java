import java.util.Scanner;

public class BodyMassIndexOfATeam {
	public static double[][] calculateBMI(double[][] personData) {
		for(int i = 0;i<personData.length;i++) {
			double weight = personData[i][0];
			double heightInCm = personData[i][1];
			double heightInMeter = heightInCm / 100;
			double bmi = weight / (heightInMeter * heightInMeter);
			personData[i][2] = bmi;
		}
		return personData;
	}
	public static String[] findBMIStatus(double[][] personData) {
		String[] weightStatus = new String[personData.length];
		for(int i = 0;i<personData.length;i++) {
			double bmi = personData[i][2];
			if(bmi < 18.5) {
				weightStatus[i] = "Underweight";
			}
			else if(bmi < 25) {
				weightStatus[i] = "Normal";
			}
			else if(bmi < 30) {
				weightStatus[i] = "Overweight";
			}
			else {
				weightStatus[i] = "Obese";
			}
		}
		return weightStatus;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[][] personData = new double[10][3];
		for(int i = 0;i<personData.length;i++) {
			double weight = sc.nextDouble();
			double height = sc.nextDouble();
			while(weight <= 0 || height <= 0) {
				weight = sc.nextDouble();
				height = sc.nextDouble();
			}
			personData[i][0] = weight;
			personData[i][1] = height;
		}
		personData = calculateBMI(personData);
		String[] weightStatus = findBMIStatus(personData);
		for(int i = 0;i<personData.length;i++) {
			System.out.println("Person "+(i+1));
			System.out.println("Weight: "+personData[i][0]);
			System.out.println("Height: "+personData[i][1]);
			System.out.println("BMI: "+personData[i][2]);
			System.out.println("Status: "+weightStatus[i]);
			System.out.println();
		}
		sc.close();
	}
}
