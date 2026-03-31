
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.util.List;

class Student2 {
    String name;
    int age;
}

public class FilterJson {
    public static void main(String[] args) {
        try {
            Gson gson = new Gson();
            List<Student> students = gson.fromJson(
                new FileReader("D:\\BridgeLabz-Training\\gcr-codebase\\jsondatahandling\\students.json.txt"),
                new TypeToken<List<Student>>(){}.getType()
            );
            for(Student s : students) {
                if(s.age > 25) {
                    System.out.println(s.name + " - " + s.age);
                }
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
