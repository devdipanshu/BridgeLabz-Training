import java.util.Scanner;

public class ReverseAString {

    public static String reverseString(String str) {

        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();
        String result = reverseString(str);
        System.out.println("Result is: ");
        System.out.println(result);
    }
}
