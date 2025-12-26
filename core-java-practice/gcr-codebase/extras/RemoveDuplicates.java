import java.util.Scanner;

public class RemoveDuplicates {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		int[] freq = new int[256];
		String result = "";
		for(int i = 0;i<word.length();i++) {
			int ascii = word.charAt(i);
			if(freq[ascii]==0) {
				result+=word.charAt(i);
				freq[ascii]++;
			}
		}
		System.out.println("Original String: "+word);
		System.out.println("String After Remiving Duplicates: "+result);
		sc.close();
	}
}
