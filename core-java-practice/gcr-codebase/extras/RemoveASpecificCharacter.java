import java.util.Scanner;

public class RemoveASpecificCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String word = sc.next();
		System.out.println("Enter the character that you want to remove: ");
		char ch = sc.next().charAt(0);
		String result = "";
		for(int i = 0;i<word.length();i++) {
			if(word.charAt(i)!=ch) {
				result+=word.charAt(i);
			}
		}
		System.out.println("Result after deleting the character is: "+result);
		sc.close();
	}
}
