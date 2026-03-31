import java.util.Scanner;

public class ToggleCaseOfCharacters {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		String result = "";
		for(int i = 0;i<word.length();i++) {
			int ascii = word.charAt(i);
			if(ascii>=65 && ascii<=90) {
				ascii = ascii+32;
				result = result+(char)ascii;
			}
			else {
				ascii = ascii-32;
				result = result+(char)ascii;
			}
		}
		System.out.println("Result after toggle case of characters is: "+result);
		sc.close();
	}
}
