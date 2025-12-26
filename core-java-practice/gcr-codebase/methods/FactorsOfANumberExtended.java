import java.util.Scanner;

public class FactorsOfANumberExtended{
	public static int[] findFactors(int number){
		int count = 0;
		for(int i = 1;i<=number;i++){
			if(number%i==0){
				count++;
			}
		}
		int[] factors = new int[count];
		int index = 0;
		for(int i = 1;i<=number;i++){
			if(number%i==0){
				factors[index] = i;
				index++;
			}
		}
		return factors;
	}
	public static int findGreatestFactor(int[] factors){
		int greatest = factors[0];
		for(int i = 1;i<factors.length;i++){
			if(factors[i]>greatest){
				greatest = factors[i];
			}
		}
		return greatest;
	}
	public static int findSumOfFactors(int[] factors){
		int sum = 0;
		for(int i = 0;i<factors.length;i++){
			sum = sum + factors[i];
		}
		return sum;
	}
	public static int findProductOfFactors(int[] factors){
		int product = 1;
		for(int i = 0;i<factors.length;i++){
			product = product * factors[i];
		}
		return product;
	}
	public static double findProductOfCubeOfFactors(int[] factors){
		double product = 1;
		for(int i = 0;i<factors.length;i++){
			product = product * Math.pow(factors[i],3);
		}
		return product;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int number = sc.nextInt();
		int[] factors = findFactors(number);
		System.out.println("Factors:");
		for(int i = 0;i<factors.length;i++){
			System.out.println(factors[i]);
		}
		int greatest = findGreatestFactor(factors);
		int sum = findSumOfFactors(factors);
		int product = findProductOfFactors(factors);
		double cubeProduct = findProductOfCubeOfFactors(factors);
		System.out.println("The Greatest Factor is: "+greatest);
		System.out.println("The Sum of the Factors is: "+sum);
		System.out.println("The Product of the Factors is: "+product);
		System.out.println("The Product of Cube of the Factors is: "+cubeProduct);
		sc.close();
	}
}
