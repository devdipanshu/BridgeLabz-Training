import java.util.Scanner;

public class CompareStringArrays {
	public static char[] convertToCharArray(String word) {
		char[] characters = new char[word.length()];
		for(int i = 0;i<word.length();i++) {
			characters[i] = word.charAt(i);
		}
		return characters;
	}
	public static boolean compareArray(char[]arr1,char[]arr2) {
		if(arr1.length!=arr2.length) {
			return false;
		}
		for(int i = 0;i<arr1.length;i++) {
			if(arr1[i]!=arr2[i]) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		
		char[] charArray1 = convertToCharArray(word);
		char[] charArray2 = word.toCharArray();
		System.out.println(compareArray(charArray1,charArray2));
	}
}
