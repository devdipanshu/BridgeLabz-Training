import java.util.Scanner;

public class SimpleInterest {
	public static int calculateSimpleInterest(int p,int r,int t) {
		int result = p*r*t/100;
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principal: ");
		int principal = sc.nextInt();
		System.out.println("Enter rate: ");
		int rate = sc.nextInt();
		System.out.println("Enter time: ");
		int time = sc.nextInt();
		
		int result = calculateSimpleInterest(principal,rate,time);
		System.out.println("The Simple Interest is "+result+" for Principal "+principal+", Rate of Interest"+rate+" and Time "+time);
		sc.close();
	}
}
