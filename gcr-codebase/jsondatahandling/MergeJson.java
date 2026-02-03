import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class MergeJson {
    public static void main(String[] args) {

        String json1 = "{\"name\":\"Rahul\",\"age\":22}";
        String json2 = "{\"email\":\"rahul@gmail.com\",\"city\":\"Delhi\"}";

        JsonObject obj1 = JsonParser.parseString(json1).getAsJsonObject();
        JsonObject obj2 = JsonParser.parseString(json2).getAsJsonObject();

        for(String key : obj2.keySet()) {
            obj1.add(key, obj2.get(key));
        }

        System.out.println(obj1);
    }
}
