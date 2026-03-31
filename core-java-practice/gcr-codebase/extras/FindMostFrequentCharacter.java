import java.util.Scanner;

public class FindMostFrequentCharacter {
	public static int[] findFrequency(String s) {
		int[]freq = new int[256];
		for(int i = 0;i<s.length();i++) {
			int ascii = s.charAt(i);
			freq[ascii] = freq[ascii]+1;
		}
		return freq;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		int[]freq = findFrequency(word);
		char mostFrequent = word.charAt(0);
		
		for(int i = 1;i<word.length();i++) {
			int ascii = word.charAt(i);
			int mostFrequentAscii = mostFrequent;
			if(freq[ascii]>freq[mostFrequentAscii]) {
				mostFrequent = word.charAt(i);
			}
		}
		System.out.println("The most frequent character is: "+mostFrequent+" and its frequency is: "+freq[mostFrequent]);
		sc.close();
	}
}
