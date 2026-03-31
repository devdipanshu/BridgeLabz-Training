import java.util.Scanner;

public class SplitWordsWithLength {

	public static int findLength(String str) {
		boolean flag = true;
		int count = 0;
		while(flag) {
			try {
				str.charAt(count);
				count++;
			}
			catch(Exception e) {
				flag = false;
				return count;
			}
		}
		return count;
	}

	public static String[] splitString(String word,int length) {
		int size = 1;
		for(int i = 0;i < length;i++) {
			if(word.charAt(i) == ' ') {
				size++;
			}
		}

		String[] words = new String[size];
		String temp = "";
		int idx = 0;

		for(int i = 0;i < length;i++) {
			if(word.charAt(i) == ' ') {
				words[idx] = temp;
				temp = "";
				idx++;
			}
			else {
				temp = temp + word.charAt(i);
			}
		}
		words[idx] = temp;
		return words;
	}

	public static int findWordLength(String word) {
		boolean flag = true;
		int count = 0;
		while(flag) {
			try {
				word.charAt(count);
				count++;
			}
			catch(Exception e) {
				flag = false;
				return count;
			}
		}
		return count;
	}

	public static String[][] create2DArray(String[] words) {
		String[][] result = new String[words.length][2];
		for(int i = 0;i < words.length;i++) {
			result[i][0] = words[i];
			result[i][1] = String.valueOf(findWordLength(words[i]));
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();

		int length = findLength(text);
		String[] words = splitString(text,length);
		String[][] result = create2DArray(words);

		System.out.println("Word\tLength");
		for(int i = 0;i < result.length;i++) {
			System.out.println(result[i][0] + "\t" + Integer.parseInt(result[i][1]));
		}

		sc.close();
	}
}
