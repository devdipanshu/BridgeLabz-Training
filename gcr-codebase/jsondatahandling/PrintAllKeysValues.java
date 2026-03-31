
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.FileReader;

public class PrintAllKeysValues {
    public static void main(String[] args) {
        try {
            JsonObject obj = JsonParser
                    .parseReader(new FileReader("D:\\BridgeLabz-Training\\gcr-codebase\\jsondatahandling\\data.json.txt"))
                    .getAsJsonObject();
            for(String key : obj.keySet()) {
                System.out.println(key + " : " + obj.get(key));
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
