import java.util.Scanner;

public class SmallestAndLargestAmongThree {
	public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
		int[]status = new int[2];
		if(number1>number2 && number1>number3) {
			status[1] = number1;
		}
		else if(number2>number1 && number2>number3) {
			status[1] = number2;
		}
		else if(number3>number1 && number3>number2) {
			status[1] = number3;
		}
		else {
			status[1] = -1;
		}
		
		if(number1<number2 && number1<number3) {
			status[0] = number1;
		}
		else if(number2<number1 && number2<number3) {
			status[0] = number2;
		}
		else if(number3<number1 && number3<number2) {
			status[0] = number3;
		}
		else {
			status[0] = -1;
		}
		return status;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2 = sc.nextInt();
		int number3 = sc.nextInt();
		
		int[]result = findSmallestAndLargest(number1,number2,number3);
		System.out.println("Smallest element among three number is: "+result[0]);
		System.out.println("Largest element among three number is: "+result[1]);
		
		sc.close();
	}
}
