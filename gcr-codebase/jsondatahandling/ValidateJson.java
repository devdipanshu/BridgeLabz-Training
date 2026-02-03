
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class ValidateJson {
    public static void main(String[] args) {
        try {
            ObjectMapper mapper = new ObjectMapper();

            JsonNode root = mapper.readTree(new File("D:\\BridgeLabz-Training\\gcr-codebase\\jsondatahandling\\user.json.txt"));

            if(root.has("name") && root.has("email") && root.has("age")) {
                System.out.println("JSON structure is valid.");
            } else {
                System.out.println("JSON structure is invalid.");
            }

        } catch(Exception e) {
            System.out.println("Invalid JSON format.");
            e.printStackTrace();
        }
    }
}
