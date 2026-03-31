import java.util.Scanner;

public class ImplementTrimMethod {
	public static String substringOfAString(String str,int start,int end) {
		String result = "";
		for(int i = start;i<=end;i++) {
			result+=str.charAt(i);
		}
		return result;
	}
	public static int[] findStartAndEnd(String str) {
		int start = 0;
		int end = str.length()-1;
		while(str.charAt(start)==' ') {
			start++;
		}
		while(str.charAt(end)==' ') {
			end--;
		}
		return new int[] {start,end};
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		int[] startAndEnd = findStartAndEnd(word);
		String trimUD = substringOfAString(word,startAndEnd[0],startAndEnd[1]);
		String trimPD = word.trim();
		System.out.println("Trim using user defined method: "+trimUD);
		System.out.println("Trim using pre defined method: "+trimPD);
		sc.close();
		
	}
}
