import java.util.Scanner;

public class FindTheOccurrenceOfSubstring {
	public static void main(String[] args) {
		System.out.println("Enter String: ");
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		System.out.println("Enter Substring: ");
		String substring = sc.nextLine();
		int count = 0;
		for(int i = 0;i<sentence.length();i++) {
			for(int j = 0;j<substring.length();j++) {
				int l = i;
				int m = j;
				int length = 0;
				while((l<sentence.length() && m<substring.length())&&(sentence.charAt(l)==substring.charAt(m))) {
					length++;
					l++;
					m++;
				}
				if(length == substring.length()) {
					count++;
				}
			}
		}
		System.out.println("The Number of substrings are: "+count);
		sc.close();
	}
}
