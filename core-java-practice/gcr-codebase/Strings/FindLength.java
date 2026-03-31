import java.util.Scanner;

public class FindLength {
	public static int findLength(String str) {
		boolean flag = true;
		int count = 0;
		while(flag) {
			try {
				str.charAt(count);
				count++;
			}
			catch(Exception e) {
				flag = false;
				return count;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		System.out.println("The Output with user defined method is: "+findLength(text));
		System.out.println("The Output with pre defined method is: "+text.length());
		sc.close();
	}
}
