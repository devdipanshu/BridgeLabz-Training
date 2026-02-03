
import com.google.gson.Gson;

class Student {
    String name;
    int age;
    String[] subjects;
}

public class CreateJson {
    public static void main(String[] args) {

        Student s = new Student();
        s.name = "Rahul Sharma";
        s.age = 21;
        s.subjects = new String[]{"Maths","Physics","Computer Science"};

        Gson gson = new Gson();
        String json = gson.toJson(s);

        System.out.println(json);
    }
}
