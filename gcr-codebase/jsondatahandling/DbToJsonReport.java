
public class DbToJsonReport {
    public static void main(String[] args) {

        int[][] users = {
                {1, 22},
                {2, 28},
                {3, 30}
        };

        String[] names = {"Aman", "Rohit", "Neha"};

        StringBuilder json = new StringBuilder();
        json.append("{\"users\":[");

        for(int i = 0;i<users.length;i++) {
            json.append("{");
            json.append("\"id\":").append(users[i][0]).append(",");
            json.append("\"name\":\"").append(names[i]).append("\",");
            json.append("\"age\":").append(users[i][1]);
            json.append("}");

            if(i < users.length - 1) {
                json.append(",");
            }
        }

        json.append("]}");

        System.out.println(json.toString());
    }
}
