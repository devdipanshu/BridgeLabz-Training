import java.util.Scanner;

public class ImplementationOfSplitMethod {
	public static int findLength(String str) {
		boolean flag = true;
		int count = 0;
		while(flag) {
			try {
				str.charAt(count);
				count++;
			}
			catch(Exception e) {
				flag = false;
				return count;
			}
		}
		return count;
	}
	public static String[] splitString(String word, int length) {
		int size = 1;
		for(int i = 0;i<length;i++) {
			if(word.charAt(i)==' ') {
				size++;
			}
		}
		
		String[] words = new String[size];
		String indexResult = "";
		int idx = 0;
		for(int i = 0;i<length;i++) {
			
			if(word.charAt(i)==' ') {
				words[idx] = indexResult;
				indexResult = "";
				idx++;
			}
			else {
				indexResult = indexResult+word.charAt(i);
			}
			
		}
		words[idx] = indexResult;
		return words;
	}
	public static boolean compareStrings(String[] str1,String[]str2) {
		boolean result = true;
		if(str1.length != str2.length) {
			return false;
		}
		for(int i = 0;i<str1.length;i++) {
			if(!str1[i].equals(str2[i])) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		int length = findLength(word);
		String[] arr1 = splitString(word,length);
		String[]arr2 = word.split(" ");
		System.out.println("The Result of both the methods are same: "+compareStrings(arr1,arr2));
		System.out.println("Result is: ");
		for(String key: arr1) {
			System.out.print("[ "+key+" ], ");
		}
		sc.close();
	}
}
