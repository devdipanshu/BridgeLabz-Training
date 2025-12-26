import java.util.Scanner;

public class PalindromeStringCheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		String reverseWord = "";
		for(int i = word.length()-1;i>=0;i--) {
			reverseWord+=word.charAt(i);
		}
		if(word.equals(reverseWord)) {
			System.out.println("Yes the strings are palindrome");
		}
		else {
			System.out.println("No the strings are palindrome");
		}
		sc.close();
	}
}
