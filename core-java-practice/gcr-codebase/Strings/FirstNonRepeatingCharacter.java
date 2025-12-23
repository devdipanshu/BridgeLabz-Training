import java.util.Scanner;

public class FirstNonRepeatingCharacter {

	public static char findFirstNonRepeating(String word) {
		int length = word.length();
		int[] freq = new int[256];

		for(int i = 0;i<length;i++) {
			int asci = word.charAt(i);
			freq[asci]=freq[asci]+1;
		}

		for(int i = 0;i<length;i++) {
			int asci = word.charAt(i);
			if(freq[asci] == 1) {
				return word.charAt(i);
			}
		}
		return '\0';
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		char result = findFirstNonRepeating(word);

		if(result != '\0') {
			System.out.println("First non repeating character is: "+result);
		}
		else {
			System.out.println("No non repeating character found");
		}
		sc.close();
	}
}

