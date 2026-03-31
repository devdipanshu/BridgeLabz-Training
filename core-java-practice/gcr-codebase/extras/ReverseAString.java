import java.util.Scanner;

public class ReverseAString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		String reverseWord = "";
		for(int i = word.length()-1;i>=0;i--) {
			reverseWord+=word.charAt(i);
		}
		System.out.println("Reversed String is: "+reverseWord);
		sc.close();
	}
	
}
