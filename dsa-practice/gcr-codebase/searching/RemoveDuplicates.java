import java.util.Scanner;
import java.util.HashSet;

public class RemoveDuplicates {

    public static String removeDuplicateCharacters(String str) {

        StringBuilder sb = new StringBuilder();
        HashSet<Character> set = new HashSet<Character>();

        for(int i = 0;i < str.length();i++) {
            char ch = str.charAt(i);
            if(!set.contains(ch)) {
                sb.append(ch);
                set.add(ch);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        String result = removeDuplicateCharacters(str);
        System.out.println("Result is: ");
        System.out.println(result);
    }
}
