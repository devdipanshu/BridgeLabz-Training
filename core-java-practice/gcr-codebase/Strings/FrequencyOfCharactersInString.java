import java.util.Scanner;

public class FrequencyOfCharactersInString {

	public static String[][] findFrequency(String word) {
		int length = word.length();
		int[] freq = new int[256];

		for(int i = 0;i<length;i++) {
			int asci = word.charAt(i);
			freq[asci] = freq[asci] + 1;
		}

		int[] temp = new int[256];
		for(int i = 0;i<256;i++) {
			temp[i] = freq[i];
		}

		int size = 0;
		for(int i = 0;i<length;i++) {
			int asci = word.charAt(i);
			if(temp[asci] != 0) {
				size++;
				temp[asci] = 0;
			}
		}

		String[][] result = new String[size][2];
		int index = 0;

		for(int i = 0;i<length;i++) {
			int asci = word.charAt(i);
			if(freq[asci] != 0) {
				result[index][0] = String.valueOf(word.charAt(i));
				result[index][1] = String.valueOf(freq[asci]);
				index++;
				freq[asci] = 0;
			}
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
		String[][] result = findFrequency(word);
		display(result);
		sc.close();
	}
}


