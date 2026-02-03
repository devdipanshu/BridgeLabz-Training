
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.FileReader;

public class CsvToJson {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("D:\\BridgeLabz-Training\\gcr-codebase\\jsondatahandling\\user.json.txt"))) {
            String line = br.readLine();
            String[] headers = line.split(",");

            JsonArray jsonArray = new JsonArray();
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                JsonObject obj = new JsonObject();
                for (int i = 0; i < headers.length; i++) {
                    obj.addProperty(headers[i], data[i]);
                }
                jsonArray.add(obj);
            }

            Gson gson = new Gson();
            String json = gson.toJson(jsonArray);
            System.out.println(json);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
