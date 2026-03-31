import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
public class JsonCsvConverter {
	public static void main(String[] args) {
		jsonToCsv("students.json","students.csv");
		csvToJson("students.csv","students_new.json");
	}
	static void jsonToCsv(String jsonFile,String csvFile) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(jsonFile));
			FileWriter fw = new FileWriter(csvFile);
			fw.write("id,name,age,marks\n");
			String line;
			while((line=br.readLine())!=null) {
				line=line.trim();
				if(line.startsWith("{")) {
					String id = line.substring(line.indexOf("id")+4,line.indexOf(","));
					String name = line.substring(line.indexOf("name")+7,line.indexOf("\"",line.indexOf("name")+7));
					String age = line.substring(line.indexOf("age")+5,line.indexOf(",",line.indexOf("age")));
					String marks = line.substring(line.indexOf("marks")+7,line.indexOf("}",line.indexOf("marks")));
					fw.write(id+","+name+","+age+","+marks+"\n");
				}
			}
			br.close();
			fw.close();

		} catch(Exception e) {
			System.out.println(e);
		}
	}
	static void csvToJson(String csvFile,String jsonFile) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(csvFile));
			FileWriter fw = new FileWriter(jsonFile);
			fw.write("[\n");
			br.readLine();
			String line;
			while((line=br.readLine())!=null) {
				String[] data = line.split(",");
				fw.write("{\"id\":"+data[0]+",\"name\":\""+data[1]+"\",\"age\":"+data[2]+",\"marks\":"+data[3]+"},\n");
			}
			fw.write("]");
			br.close();
			fw.close();
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
