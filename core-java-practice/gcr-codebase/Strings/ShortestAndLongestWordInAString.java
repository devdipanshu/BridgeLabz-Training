import java.util.Scanner;

public class ShortestAndLongestWordInAString {

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

	public static int[] findShortestAndLongest(String[][] arr) {
		int min = Integer.parseInt(arr[0][1]);
		int max = Integer.parseInt(arr[0][1]);
		int minIndex = 0;
		int maxIndex = 0;

		for(int i = 1;i < arr.length;i++) {
			int value = Integer.parseInt(arr[i][1]);
			if(value < min) {
				min = value;
				minIndex = i;
			}
			if(value > max) {
				max = value;
				maxIndex = i;
			}
		}
		return new int[]{minIndex,maxIndex};
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();

		int length = findLength(text);
		String[] words = splitString(text,length);
		String[][] result = create2DArray(words);

		int[] index = findShortestAndLongest(result);

		System.out.println("Shortest Word: " + result[index[0]][0] + 
			" Length: " + Integer.parseInt(result[index[0]][1]));
		System.out.println("Longest Word: " + result[index[1]][0] + 
			" Length: " + Integer.parseInt(result[index[1]][1]));

		sc.close();
	}
}
