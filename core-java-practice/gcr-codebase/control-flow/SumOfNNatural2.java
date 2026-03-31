import java.util.Scanner;

public class SumOfNNatural2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int count1 = 0;
		int temp = num;
		if(num>=1) {
			while(temp>=1) {
				count1+=temp;
				temp--;
			}
			int count2 = num*(num+1)/2;
			System.out.println("Sum of natural number by while loop is "+count1+" and by formula is "+count2);
		}
		else {
			System.out.println("Number is not a natural number");
		}
		sc.close();
	}
}
