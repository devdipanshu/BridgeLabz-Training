import java.util.Scanner;

public class UniqueCharacterInAString {

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

	public static char[] findUniqueCharacters(String word,int length) {
		char[] unique = new char[length];
		int index = 0;

		for(int i = 0;i<length;i++) {
			char current = word.charAt(i);
			boolean uniqueChar = true;

			for(int j = 0;j<i;j++) {
				if(word.charAt(j) == current) {
					uniqueChar = false;
					break;
				}
			}

			if(uniqueChar) {
				unique[index] = current;
				index++;
			}
		}

		char[] result = new char[index];
		for(int i = 0;i<index;i++) {
			result[i] = unique[i];
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		int length = findLength(word);
		char[] result = findUniqueCharacters(word,length);

		for(char ch : result) {
			System.out.print(ch+" ");
		}
		sc.close();
	}
}
