import java.util.Scanner;

public class ConvertIntoUpperCase {
	public static boolean compareUpperCaseStrings(String str1,String str2) {
		if(str1.equals(str2)) {
			return true;
		}
		return false;
	}
	public static String converIntoUpperCase(String str) {
		String result = "";
		for(int i = 0;i<str.length();i++) {
			int val = str.charAt(i);
			if(val>=97 && val<=122) {
				val = val-'a'+'A';
				char character = (char)val;
				result+=character;
			}
			else {
				result+=str.charAt(i);
			}
			
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String text = sc.nextLine();
		String upperCase1 = converIntoUpperCase(text);
		String upperCase2 = text.toUpperCase();
		System.out.println("The results of user defined and Pre defined is same: "+compareUpperCaseStrings(upperCase1,upperCase2));
		System.out.println("And the Result is: "+upperCase1);
		sc.close();
	}
}
