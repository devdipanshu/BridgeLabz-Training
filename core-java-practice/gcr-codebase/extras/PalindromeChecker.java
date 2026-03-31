import java.util.Scanner;

public class PalindromeChecker {
	public static String takeInput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String str = sc.nextLine();
		sc.close();
		return str;
	}
	public static boolean checkPalindrome(String str) {
		int i = 0;
		int j = str.length()-1;
		boolean result = true;
		while(i<j) {
			if(str.charAt(i)!=str.charAt(j)) {
				result = false;
				break;
			}
			i++;
			j--;
		}
		return result;
	}
	public static void displayResult(boolean flag) {
		if(flag) {
			System.out.println("Yes this string is a palindrome");
		}
		else {
			System.out.println("No this string is not a palindrome");
		}
	}
	public static void main(String[] args) {
		String str = takeInput();
		boolean result = checkPalindrome(str);
		displayResult(result);
	}
}
