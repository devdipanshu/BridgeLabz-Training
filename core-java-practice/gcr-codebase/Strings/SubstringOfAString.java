import java.util.Scanner;

public class SubstringOfAString {
	public static String findSubstring(String word,int start,int end) {
		String result="";
		for(int i = start;i<end;i++) {
			result+=word.charAt(i);
		}
		return result;
	}
	public static boolean compareString(String word1,String word2) {
		if (word1.length() != word2.length()) {
			return false;
		}
		for (int i = 0; i < word1.length(); i++) {
			if (word1.charAt(i) != word2.charAt(i)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		int start = sc.nextInt();
		int end = sc.nextInt();
		
		String substringUD = findSubstring(word,start,end);
		String substringPD = word.substring(start,end);
		
		System.out.println(compareString(substringUD,substringPD));
	}
	
}
