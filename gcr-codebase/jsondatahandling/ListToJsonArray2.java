
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.List;

class Student3 {
    String name;
    int age;
    String[] subjects;
}

public class ListToJsonArray2 {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        Student s1 = new Student();
        s1.name = "Rahul";
        s1.age = 21;
        s1.subjects = new String[]{"Maths","Physics"};
        students.add(s1);

        Student s2 = new Student();
        s2.name = "Anjali";
        s2.age = 22;
        s2.subjects = new String[]{"Chemistry","Biology"};
        students.add(s2);
        Gson gson = new Gson();
        String jsonArray = gson.toJson(students);

        System.out.println(jsonArray);
    }
}
