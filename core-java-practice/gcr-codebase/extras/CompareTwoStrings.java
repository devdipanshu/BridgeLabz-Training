import java.util.Scanner;

public class CompareTwoStrings {
	public static void compareLexicographically(String s1, String s2) {
		int i = 0;
		int j = 0;
		boolean flag = false;
		while(i<s1.length() && j<s2.length()) {
			
			if(s1.charAt(i)>s2.charAt(j)) {
				System.out.println(s2+" comes befor "+s1+" in lexicographically order");
				flag = true;
				break;
			}
			else if(s1.charAt(i)<s2.charAt(j)) {
				System.out.println(s1+" comes befor "+s2+" in lexicographically order");
				flag = true;
				break;
			}
			else {
				i++;
				j++;
			}
		}
		if(flag == false) {
			if(i<s1.length()) {
				System.out.println(s2+" comes befor "+s1+" in lexicographically order");
			}
			else if(j<s2.length()){
				System.out.println(s1+" comes befor "+s2+" in lexicographically order");
			}
			else {
				System.out.println("Both Are Equal");
			}
		}
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word1 = sc.next();
		String word2 = sc.next();
		compareLexicographically(word1,word2);
		sc.close();
	}
}
