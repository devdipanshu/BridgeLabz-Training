import java.util.Scanner;

public class LexicalTwist {

    static boolean isValidWord(String s) {
        if(s.contains(" ")) {
            System.out.println(s + " is an invalid word");
            return false;
        }
        return true;
    }

    static boolean isReverse(String a,String b) {
        String rev = "";
        for(int i = a.length() - 1;i >= 0;i--) {
            rev = rev + a.charAt(i);
        }
        return rev.equalsIgnoreCase(b);
    }

    static boolean isVowel(char ch) {
        return ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'
            || ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u';
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first word");
        String w1 = sc.nextLine();

        if(!isValidWord(w1)) {
            return;
        }

        System.out.println("Enter the second word");
        String w2 = sc.nextLine();
        if(!isValidWord(w2)) {
            return;
        }
        if(isReverse(w1,w2)) {

            String rev = "";
            for(int i = w1.length() - 1;i >= 0;i--) {
                rev = rev + w1.charAt(i);
            }

            rev = rev.toLowerCase();

            String result = "";
            for(int i = 0;i < rev.length();i++) {
                char ch = rev.charAt(i);
                if(isVowel(ch)) {
                    result = result + "@";
                } else {
                    result = result + ch;
                }
            }

            System.out.println(result);
        }
        else {

            String combined = (w1 + w2).toUpperCase();

            int vowelCount = 0;
            int consonantCount = 0;

            for(int i = 0;i < combined.length();i++) {
                char ch = combined.charAt(i);
                if(isVowel(ch)) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }

            if(vowelCount > consonantCount) {

                String printed = "";
                for(int i = 0;i < combined.length();i++) {
                    char ch = combined.charAt(i);
                    if(isVowel(ch) && printed.indexOf(ch) == -1) {
                        printed = printed + ch;
                        if(printed.length() == 2) {
                            break;
                        }
                    }
                }
                System.out.println(printed);

            } else if(consonantCount > vowelCount) {

                String printed = "";
                for(int i = 0;i < combined.length();i++) {
                    char ch = combined.charAt(i);
                    if(!isVowel(ch) && printed.indexOf(ch) == -1) {
                        printed = printed + ch;
                        if(printed.length() == 2) {
                            break;
                        }
                    }
                }
                System.out.println(printed);

            } else {
                System.out.println("Vowels and consonants are equal");
            }
        }
    }
}