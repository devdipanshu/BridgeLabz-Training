import java.util.Scanner;

public class FlipKeyLogicalProblem {
    public static String CleanseAndInvert(String input) {
        if(input == null || input.length() < 6) {
            return "";
        }
        for(int i = 0;i < input.length();i++) {
            char ch = input.charAt(i);
            if(!(ch >= 'A' && ch <= 'Z' || ch >= 'a' && ch <= 'z')) {
                return "";
            }
        }
        String lower = input.toLowerCase();
        String filtered = "";
        for(int i = 0;i < lower.length();i++) {
            char ch = lower.charAt(i);
            if(ch % 2 != 0) {
                filtered = filtered + ch;
            }
        }
        String rev = "";
        for(int i = filtered.length() - 1;i >= 0;i--) {
            rev = rev + filtered.charAt(i);
        }
        String result = "";
        for(int i = 0;i < rev.length();i++) {
            char ch = rev.charAt(i);
            if(i % 2 == 0) {
                result = result + Character.toUpperCase(ch);
            } else {
                result = result + ch;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String input = sc.nextLine();
        String key = CleanseAndInvert(input);
        if(key.equals("")) {
            System.out.println("Invalid Input");
        } else {
            System.out.println("The generated key is - " + key);
        }
    }
}
