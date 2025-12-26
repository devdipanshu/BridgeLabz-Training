import java.util.Scanner;

public class MaximumNumberOfHandShakes {
	public static int calculateHandShakes(int n) {
		int result = (n*(n-1))/2;
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numberOfStudents = sc.nextInt();
		int result = calculateHandShakes(numberOfStudents);
		System.out.println("Total number of handshakes among "+numberOfStudents+" is: "+result);
		sc.close();
	}
}
