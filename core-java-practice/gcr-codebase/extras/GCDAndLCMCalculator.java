import java.util.Scanner;

public class GCDAndLCMCalculator {
	public static int[] takeInputs() {
		Scanner sc = new Scanner(System.in);
		int[] input = new int[2];
		System.out.println("Enter number 1: ");
		input[0] = sc.nextInt();
		System.out.println("Enter number 2: ");
		input[1] = sc.nextInt();
		sc.close();
		return input;
	}
	public static int calculateGCD(int num1,int num2) {
		if(num2 == 0) {
			return num1;
		}
		return calculateGCD(num2,(num1%num2));
	}
	public static int calculateLCM(int GCD, int multiple) {
		return (multiple/GCD);
	}
	public static void displayResult(int GCD, int LCM) {
		System.out.println("GCD of two numbers is: "+GCD);
		System.out.println("LCM of two numbers is: "+LCM);
	}
	public static void main(String[] args) {
		int[]inputs = takeInputs();
		int GCD;
		if(inputs[0]>=inputs[1]) {
			GCD = calculateGCD(inputs[0],inputs[1]);
		}
		else {
			GCD = calculateGCD(inputs[1],inputs[0]);
		}
		int LCM = calculateLCM(GCD,(inputs[0]*inputs[1]));
		displayResult(GCD,LCM);
	}
}
