
import java.util.ArrayList;
import java.util.List;

public class EmailNotifications {
    public static void sendEmailNotification(String email){
        System.out.println("Sending notification email to : " + email);
    }
    public static void main(String[] args) {
        List<String> emails = new ArrayList<>();
        emails.add("user1@gmail.com");
        emails.add("user2@gmail.com");
        emails.add("user3@gmail.com");
        emails.add("user4@gmail.com");
        emails.forEach(email ->
            sendEmailNotification(email)
        );
    }
}
