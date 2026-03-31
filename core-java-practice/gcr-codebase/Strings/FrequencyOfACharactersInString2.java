import java.util.Scanner;

public class FrequencyOfACharactersInString2 {

	public static char[] uniqueCharacters(String word,int length) {
		char[] temp = new char[length];
		int index = 0;

		for(int i = 0;i<length;i++) {
			boolean isUnique = true;
			for(int j = 0;j<i;j++) {
				if(word.charAt(i) == word.charAt(j)) {
					isUnique = false;
					break;
				}
			}
			if(isUnique) {
				temp[index] = word.charAt(i);
				index++;
			}
		}

		char[] unique = new char[index];
		for(int i = 0;i<index;i++) {
			unique[i] = temp[i];
		}
		return unique;
	}

	public static String[][] findFrequency(String word,int length) {
		int[] freq = new int[256];

		for(int i = 0;i<length;i++) {
			int asci = word.charAt(i);
			freq[asci] = freq[asci] + 1;
		}

		char[] unique = uniqueCharacters(word,length);
		String[][] result = new String[unique.length][2];

		for(int i = 0;i<unique.length;i++) {
			int asci = unique[i];
			result[i][0] = String.valueOf(unique[i]);
			result[i][1] = String.valueOf(freq[asci]);
		}
		return result;
	}

	public static void display(String[][] result) {
		System.out.println("Character   Frequency");
		for(int i = 0;i<result.length;i++) {
			System.out.println(result[i][0]+"           "+result[i][1]);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		int length = word.length();
		String[][] result = findFrequency(word,length);
		display(result);
		sc.close();
	}
}

