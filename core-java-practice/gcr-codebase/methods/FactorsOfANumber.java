import java.util.Scanner;

public class FactorsOfANumber {
	public static int[] findFactors(int num) {
		int count =  0;
		for(int i = 1;i<num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		int[]factors = new int[count];
		int index = 0;
		for(int i = 1;i<num;i++) {
			if(num%i==0) {
				factors[index] = i;
				index++;
			}
		}
		return factors;
	}
	public static int sumOfFactors(int[] arr) {
		int sum = 0;
		for(int i = 0;i<arr.length;i++) {
			sum+=arr[i];
		}
		return sum;
	}
	public static int productOfFactors(int[] arr) {
		int product = 1;
		for(int i = 0;i<arr.length;i++) {
			product*=arr[i];
		}
		return product;
	}
	public static int sumOfSquare(int[]arr) {
		int sum = 0;
		for(int i = 0;i<arr.length;i++) {
			sum+=Math.pow(arr[i], 2);
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] factors = findFactors(num);
		System.out.println("Factors are: ");
		for(int i = 0;i<factors.length;i++) {
			System.out.print(factors[i]+" ");
		}
		System.out.println();
		int sumOfFactors = sumOfFactors(factors);
		int productOfFactors = productOfFactors(factors);
		int sumOfSquare = sumOfSquare(factors);
		
		System.out.println("Sum of factors is: "+sumOfFactors);
		System.out.println("Product of factors is: "+productOfFactors);
		System.out.println("Sum of square of factors is: "+sumOfSquare);
		sc.close();
	}
}
