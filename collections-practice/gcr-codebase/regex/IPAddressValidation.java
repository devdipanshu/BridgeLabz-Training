import java.util.Scanner;
import java.util.regex.Pattern;

public class IPAddressValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter IPv4 address:");
        String ip = sc.nextLine();
        String regex =
                "^((25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])\\.){3}" +
                "(25[0-5]|2[0-4][0-9]|1[0-9]{2}|[1-9]?[0-9])$";
        if(Pattern.matches(regex, ip)) {
            System.out.println("Valid IPv4 Address");
        } else {
            System.out.println("Invalid IPv4 Address");
        }

        sc.close();
    }
}
