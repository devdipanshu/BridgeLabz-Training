
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.FileReader;

public class ReadSpecificFields {
    public static void main(String[] args) {
        try {
            JsonObject obj = JsonParser
                    .parseReader(new FileReader("D:\\BridgeLabz-Training\\gcr-codebase\\jsondatahandling\\user.json.txt"))
                    .getAsJsonObject();

            String name = obj.get("name").getAsString();
            String email = obj.get("email").getAsString();

            System.out.println(name);
            System.out.println(email);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
