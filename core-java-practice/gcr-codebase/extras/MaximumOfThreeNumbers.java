import java.util.Scanner;

public class MaximumOfThreeNumbers {

	public static int[] takeInput() {
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[3];
		System.out.print("Enter first number: ");
		nums[0] = sc.nextInt();
		System.out.print("Enter second number: ");
		nums[1] = sc.nextInt();
		System.out.print("Enter third number: ");
		nums[2] = sc.nextInt();
		sc.close();
		return nums;
	}

	public static int findMaximum(int[] nums) {
		int max = nums[0];
		if(nums[1] > max) {
			max = nums[1];
		}
		if(nums[2] > max) {
			max = nums[2];
		}
		return max;
	}

	public static void main(String[] args) {
		int[]numbers = takeInput();
		int max = findMaximum(numbers);
		System.out.println("Maximum number of three numbers is: " + max);
	}
}
