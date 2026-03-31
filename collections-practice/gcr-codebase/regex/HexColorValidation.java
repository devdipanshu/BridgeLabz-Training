import java.util.Scanner;
import java.util.regex.Pattern;
public class HexColorValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hex color code:");
        String color = sc.nextLine();
        String regex = "^#[0-9A-Fa-f]{6}$";
        if(Pattern.matches(regex, color)) {
            System.out.println("Valid Hex Color Code");
        } else {
            System.out.println("Invalid Hex Color Code");
        }

        sc.close();
    }
}
