import java.util.Scanner;

public class FrequencyOfCharactersInString3 {

	public static String[][] findFrequency(String word) {
		char[] ch = word.toCharArray();
		int length = word.length();
		int[] freq = new int[length];

		for(int i = 0;i<length;i++) {
			freq[i] = 1;
			if(ch[i] == '0') {
				continue;
			}
			for(int j = i+1;j<length;j++) {
				if(ch[i] == ch[j]) {
					freq[i]++;
					ch[j] = '0';
				}
			}
		}

		int size = 0;
		for(int i = 0;i<length;i++) {
			if(ch[i] != '0') {
				size++;
			}
		}

		String[][] result = new String[size][2];
		int index = 0;

		for(int i = 0;i<length;i++) {
			if(ch[i] != '0') {
				result[index][0] = String.valueOf(ch[i]);
				result[index][1] = String.valueOf(freq[i]);
				index++;
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
