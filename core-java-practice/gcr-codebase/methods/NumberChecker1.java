import java.util.Scanner;

public class NumberChecker1{
	public static int countDigits(int number){
		int count = 0;
		while(number>0){
			count++;
			number = number/10;
		}
		return count;
	}
	public static int[] storeDigits(int number,int count){
		int[] digits = new int[count];
		int index = count-1;
		while(number>0){
			digits[index] = number%10;
			number = number/10;
			index--;
		}
		return digits;
	}
	public static boolean isDuckNumber(int[] digits){
		for(int i = 0;i<digits.length;i++) {
			if(digits[i] == 0){
				return true;
			}
		}
		return false;
	}
	public static boolean isArmstrong(int number,int[] digits){
		int sum = 0;
		int power = digits.length;

		for(int i = 0;i<digits.length;i++){
			int mul = 1;
			for(int j = 0;j<power;j++){
				mul = mul * digits[i];
			}
			sum += mul;
		}
		if(sum == number){
			return true;
		}
		return false;
	}
	public static int[] findLargestSecondLargest(int[] digits){
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		for(int i = 0;i<digits.length;i++){
			if(digits[i] > largest) {
				secondLargest = largest;
				largest = digits[i];
			} else if(digits[i] > secondLargest && digits[i] != largest) {
				secondLargest = digits[i];
			}
		}
		return new int[]{largest,secondLargest};
	}
	public static int[] findSmallestSecondSmallest(int[] digits) {
		int smallest = Integer.MAX_VALUE;
		int secondSmallest = Integer.MAX_VALUE;
		for(int i = 0;i<digits.length;i++){
			if(digits[i] < smallest){
				secondSmallest = smallest;
				smallest = digits[i];
			} else if(digits[i] < secondSmallest && digits[i] != smallest) {
				secondSmallest = digits[i];
			}
		}
		return new int[]{smallest,secondSmallest};
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = sc.nextInt();
		int count = countDigits(number);
		int[] digits = storeDigits(number,count);
		System.out.println("Digits:");
		for(int i = 0;i<digits.length;i++){
			System.out.println(digits[i]);
		}
		System.out.println("Duck Number: "+isDuckNumber(digits));
		System.out.println("Armstrong Number: "+isArmstrong(number,digits));
		int[] max = findLargestSecondLargest(digits);
		System.out.println("Largest: "+max[0]);
		System.out.println("Second Largest: "+max[1]);
		int[] min = findSmallestSecondSmallest(digits);
		System.out.println("Smallest: "+min[0]);
		System.out.println("Second Smallest: "+min[1]);
		sc.close();
	}
}

