import java.util.Scanner;

public class BasicCalculator {
	public static int[] takeInputs() {
		Scanner sc = new Scanner(System.in);
		int[] inputs = new int[3];
		System.out.println("Enter the first number: ");
		inputs[0] = sc.nextInt();
		System.out.println("Enter the second number: ");
		inputs[1] = sc.nextInt();
		System.out.println("Enter choice 1 for Addition, 2 for Subtraction, 3 for Multiplication, 4 for Division: ");
		inputs[2] = sc.nextInt();
		sc.close();
		return inputs;
	}
	public static int addition(int num1,int num2) {
		int result = num1+num2;
		return result;
	}
	public static int subtraction(int num1,int num2) {
		int result = num1-num2;
		return result;
	}
	public static int multiplication(int num1,int num2) {
		int result = num1*num2;
		return result;
	}
	public static int division(int num1,int num2) {
		int result = num1/num2;
		return result;
	}
	public static void displayResult(int result,int choice) {
		if(choice == 1) {
			System.out.println("Addition result is: "+result);
		}
		else if(choice == 2) {
			System.out.println("Subtraction result is: "+result);
		}
		else if(choice == 3) {
			System.out.println("Multiplication result is: "+result);
		}
		else {
			System.out.println("Division result is: "+result);
		}
	}
	public static void main(String[] args) {
		int[] inputs = takeInputs();
		int result;
		if(inputs[2] == 1) {
			result = addition(inputs[0],inputs[1]);
		}
		else if(inputs[2] == 2) {
			result = subtraction(inputs[0],inputs[1]);
		}
		else if(inputs[2] == 3) {
			result = multiplication(inputs[0],inputs[1]);
		}
		else {
			result = division(inputs[0],inputs[1]);
		}
		displayResult(result,inputs[2]);
	}
}

