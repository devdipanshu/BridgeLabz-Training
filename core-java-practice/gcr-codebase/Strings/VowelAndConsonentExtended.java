import java.util.Scanner;

public class VowelAndConsonentExtended {
	public static String vowelOrConsonent(char ch) {
		
		int asci = ch;
		if(asci>=65 && asci<=90) {
			asci = asci+32;
		}
		if(asci<97 || asci>122) {
		    return "Not a Letter";
		}
		if(asci == 97 || asci == 101 || asci == 105 || asci == 111 || asci == 117) {
		    return "Vowel";
		}
		else {
			return "Consonent";
		}
	}
	public static String[][] findVowelAndConsonent(String str) {
		
		String[][] result = new String[str.length()][2];
		
		for(int i = 0;i<str.length();i++) {
			result[i][0] = String.valueOf(str.charAt(i));
			result[i][1] = vowelOrConsonent(str.charAt(i));
		}
		return result;
	}
	public static void displayResult(String[][] arr) {
		
		System.out.println("Character    Type");
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i][0]+"        "+arr[i][1]);
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		String[][] result = findVowelAndConsonent(word);
		displayResult(result);
		sc.close();
	}
}
