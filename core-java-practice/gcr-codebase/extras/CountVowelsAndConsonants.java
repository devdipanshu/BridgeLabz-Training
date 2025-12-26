import java.util.Scanner;

public class CountVowelsAndConsonants{
	public static String vowelOrConsonent(char ch) {
		
		int asci = ch;
		if(asci>=65 && asci<=90) {
			asci = asci+32;
		}
		if(asci<97 || asci>122) {
		    return "nonalphabet";
		}
		if(asci == 97 || asci == 101 || asci == 105 || asci == 111 || asci == 117) {
		    return "vowel";
		}
		else {
			return "consonent";
		}
		
	}
	public static int[] countVowelAndConsonent(String str) {
		int vowelCount = 0;
		int consonentCount = 0;
		for(int i = 0;i<str.length();i++) {
			String ans = vowelOrConsonent(str.charAt(i));
			if(ans.equals("vowel")) {
				vowelCount++;
			}
			else if(ans.equals("consonent")) {
				consonentCount++;
			}
		}
		int [] result = {vowelCount,consonentCount};
		
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		int[]result = countVowelAndConsonent(word);
		System.out.println("Number of vowels are: "+result[0]);
		System.out.println("Number of consonent are: "+result[1]);
		sc.close();
	}
}