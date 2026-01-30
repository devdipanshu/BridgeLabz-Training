import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SSNValidation {
    public static void main(String[] args) {

        String text = "My SSN is 123-45-6789.";
        String regex = "\\b\\d{3}-\\d{2}-\\d{4}\\b";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(text);
        if(m.find()) {
            System.out.println(m.group() + " is valid");
        } else {
            System.out.println("Invalid SSN");
        }
    }
}
