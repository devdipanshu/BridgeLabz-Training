import java.util.Scanner;

public class SumOfNNaturalUsingForLoop{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count1 = 0;
		if(num>=1) {
			for(int temp = 1;temp<=num;temp++) {
				count1+=temp;
			}
			int count2 = num*(num+1)/2;
			System.out.println("Sum of natural number by For loop is "+count1+" and by formula is "+count2);
		}
		else {
			System.out.println("Number is not a natural number");
		}
		sc.close();
	}
}