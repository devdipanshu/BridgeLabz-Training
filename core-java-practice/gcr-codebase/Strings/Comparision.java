import java.util.Scanner;

public class Comparision {
	public static boolean isEqual(String word1, String word2) {
		if (word1.length() != word2.length()) {
			return false;
		}
		for (int i = 0; i < word1.length(); i++) {
			if (word1.charAt(i) != word2.charAt(i)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word1 = sc.next();
		String word2 = sc.next();

		if (isEqual(word1, word2) == word1.equals(word2)) {
			System.out.println(
				"The result is same of both the methods, and the result is: " 
				+ isEqual(word1, word2)
			);
		} else {
			System.out.println(
				"The result is not same of both the methods, result of predefined method is: "
				+ word1.equals(word2)
				+ " and the result of user defined method is: "
				+ isEqual(word1, word2)
			);
		}
		sc.close();
		
	}
}