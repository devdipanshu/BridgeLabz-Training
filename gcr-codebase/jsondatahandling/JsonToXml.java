
import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class JsonToXml {
    public static void main(String[] args) {
        String jsonData="{\"name\":\"Rahul Sharma\",\"age\":22,\"email\":\"rahul@gmail.com\"}";

        Gson gson = new Gson();
        JsonObject obj = gson.fromJson(jsonData, JsonObject.class);

        StringBuilder xml = new StringBuilder();
        xml.append("<root>");
        for(String key : obj.keySet()) {
            xml.append("<").append(key).append(">");
            xml.append(obj.get(key).getAsString());
            xml.append("</").append(key).append(">");
        }
        xml.append("</root>");

        System.out.println(xml.toString());
    }
}
