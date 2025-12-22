import java.util.Scanner;

public class ConvertIntoLowerCase {

	public static boolean compareLowerCaseStrings(String str1,String str2) {
		if(str1.equals(str2)) {
			return true;
		}
		return false;
	}

	public static String convertIntoLowerCase(String str) {
		String result = "";
		for(int i = 0; i < str.length(); i++) {
			int val = str.charAt(i);
			if(val >= 65 && val <= 90) { 
				val = val - 'A' + 'a';
				char character = (char)val;
				result += character;
			} else {
				result += str.charAt(i);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.nextLine();

		String lowerCase1 = convertIntoLowerCase(text);
		String lowerCase2 = text.toLowerCase();

		System.out.println("The results of user defined and Pre defined is same: " + compareLowerCaseStrings(lowerCase1, lowerCase2));
		System.out.println("And the Result is: " + lowerCase1);

		sc.close();
	}
}
