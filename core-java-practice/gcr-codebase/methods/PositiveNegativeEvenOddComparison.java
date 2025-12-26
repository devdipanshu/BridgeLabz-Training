import java.util.Scanner;

public class PositiveNegativeEvenOddComparison {

	public static boolean isPositive(int num) {
		if(num >= 0) {
			return true;
		}
		return false;
	}
	public static boolean isEven(int num) {
		if(num%2==0) {
			return true;
		}
		return false;
	}
	public static int compare(int number1, int number2) {
		if(number1 > number2) {
			return 1;
		}
		else if(number1 == number2) {
			return 0;
		}
		return -1;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i = 0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0;i<arr.length;i++) {
			boolean status = isPositive(arr[i]);
			if(status==true) {
				boolean evenStatus = isEven(arr[i]);
				if(evenStatus == true) {
					System.out.println(arr[i]+" is Positive and Even number");
				}
				else {
					System.out.println(arr[i]+" is Positive and Odd number");
				}
			}
			else {
				System.out.println(arr[i]+" is Negative number");
			}
		}
		int result = compare(arr[0],arr[arr.length-1]);

		if(result == 1) {
			System.out.println("First element is greater than last element");
		}
		else if(result == 0) {
			System.out.println("First element is equal to last element");
		}
		else {
			System.out.println("First element is less than last element");
		}

		sc.close();
	}
}
