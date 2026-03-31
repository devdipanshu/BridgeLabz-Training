import java.util.ArrayList;
import java.util.List;

public class EventWelcomeMessage {

    public static void main(String[] args) {

        List<String> attendees = new ArrayList<>();

        attendees.add("Aman");
        attendees.add("Neha");
        attendees.add("Rohit");
        attendees.add("Priya");
        attendees.add("Dipanshu");

        attendees.stream()
        .forEach(name ->
            System.out.println("Welcome to the event, " + name + "!")
        );
    }
}
