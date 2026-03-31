import java.util.Scanner;

public class ValidAnagram {
    public static boolean isAnagram(String s, String t) {
        int[]arr1 = new int[26];
        int[]arr2 = new int[26];
        for(int i = 0; i<s.length();i++){
            int a = s.charAt(i)-'a';
            arr1[a] = arr1[a]+1;
        }
        for(int i = 0; i<t.length();i++){
            int a = t.charAt(i)-'a';
            arr2[a] = arr2[a]+1;
        }
        if(s.length()!=t.length()){
            return false;
        }
        for(int i = 0; i<s.length();i++){
            int a = s.charAt(i)-'a';
            if(arr1[a]!=arr2[a]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		System.out.println(isAnagram(s1,s2));
	}
}