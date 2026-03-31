import java.util.Scanner;
import java.util.regex.Pattern;

public class CreditCardValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter credit card number:");
        String card = sc.nextLine();
        String regex = "^(4[0-9]{15}|5[0-9]{15})$";
        if(Pattern.matches(regex, card)) {
            System.out.println("Valid Credit Card Number");
        } else {
            System.out.println("Invalid Credit Card Number");
        }

        sc.close();
    }
}
