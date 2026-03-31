
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ExpiringMemberships {

    static class Member{
        String name;
        LocalDate expiryDate;

        Member(String name,LocalDate expiryDate){
            this.name = name;
            this.expiryDate = expiryDate;
        }
    }

    public static void main(String[] args) {

        List<Member> list = new ArrayList<>();
        list.add(new Member("Amit",LocalDate.now().plusDays(10)));
        list.add(new Member("Rohit",LocalDate.now().plusDays(40)));
        list.add(new Member("Neha",LocalDate.now().plusDays(25)));
        list.add(new Member("Karan",LocalDate.now().minusDays(5)));
        list.add(new Member("Priya",LocalDate.now().plusDays(30)));

        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        list.stream()
        .filter(m ->
            m.expiryDate.isAfter(today.minusDays(1)) &&
            m.expiryDate.isBefore(next30Days.plusDays(1))
        )
        .forEach(m ->
            System.out.println(m.name+" | Expiry : "+m.expiryDate)
        );
    }
}
