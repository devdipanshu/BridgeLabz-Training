import java.util.Scanner;

public class PalindromeCheck {
	public static boolean palindromeMethodFirst(String word) {
		int i = 0;
		int j = word.length()-1;
		boolean flag = true;
		while(i<j) {
			if(word.charAt(i)!=word.charAt(j)) {
				flag = false;
				break;
			}
			i++;
			j--;
		}
		return flag;
	}
	public static boolean recursivePalindromeMethod(String word,int i,int j) {
		if(i>=j) {
			return true;
		}
		if(word.charAt(i)!=word.charAt(j)) {
			return false;
		}
		return recursivePalindromeMethod(word,i+1,j-1);
	}
	public static char[] reverseString(String word) {
		int length = word.length();
		char[] reverse = new char[length];
		int index = 0;
		for(int i = length-1;i>=0;i--) {
			reverse[index] = word.charAt(i);
			index++;
		}
		return reverse;
	}

	public static boolean palindromeMethodThird(String word) {
		char[] original = word.toCharArray();
		char[] reverse = reverseString(word);

		for(int i = 0;i<original.length;i++) {
			if(original[i] != reverse[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		boolean fisrtMethodResult = palindromeMethodFirst(word);
		System.out.println("Output from method 1: ");
		System.out.println(fisrtMethodResult);
		
		System.out.println("Output from method 2: ");
		boolean recursivePalindromeResult = recursivePalindromeMethod(word,0,word.length()-1);
		System.out.println(recursivePalindromeResult);
		System.out.println("Output from method 3: ");
		boolean thirdMethodResult = palindromeMethodThird(word);
		System.out.println(thirdMethodResult);
		sc.close();
	}
}
