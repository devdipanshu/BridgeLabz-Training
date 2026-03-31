import java.util.Scanner;

public class CheckIfAnagramOrNot {

	public static boolean checkIfAnagram(String word1, String word2) {
		if(word1.length() != word2.length()) {
			return false;
		}

		int[] freq1 = new int[256];
		int[] freq2 = new int[256];

		for(int i = 0; i < word1.length(); i++) {
			int asci1 = word1.charAt(i);
			int asci2 = word2.charAt(i);
			freq1[asci1]++;
			freq2[asci2]++;
		}

		for(int i = 0; i < 256; i++) {
			if(freq1[i] != freq2[i]) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first String: ");
		String word1 = sc.nextLine();
		System.out.println("Enter the second String: ");
		String word2 = sc.nextLine();

		boolean result = checkIfAnagram(word1, word2);

		if(result==true) {
			System.out.println("These two strings "+word1+" and "+word2+" are anagram of each other");
		} else {
			System.out.println("These two strings "+word1+" and "+word2+" are not anagram of each other");
		}

		sc.close();
	}
}
