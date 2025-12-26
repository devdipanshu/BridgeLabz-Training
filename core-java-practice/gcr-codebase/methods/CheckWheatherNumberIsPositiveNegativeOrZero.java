import java.util.Scanner;

public class CheckWheatherNumberIsPositiveNegativeOrZero {
	public static int checkNumber(int num) {
		if(num>0) {
			return 1;
		}
		else if(num<0) {
			return -1;
		}
		return 0;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int result= checkNumber(num);
		System.out.println("Result is: "+result);
		sc.close();
	}
}
