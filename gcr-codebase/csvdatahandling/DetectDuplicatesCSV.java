import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
public class DetectDuplicatesCSV {
	public static void main(String[] args) {
		HashMap<String,Integer> map = new HashMap<>();
		try {
			BufferedReader br = new BufferedReader(new FileReader("D:\\BridgeLabz-Training\\gcr-codebase\\csvdatahandling\\students.txt"));
			String header = br.readLine();
			String line;
			while((line=br.readLine())!=null) {
				String[] data = line.split(",");
				String id = data[0];
				if(map.containsKey(id)) {
					map.put(id,map.get(id)+1);
				} else {
					map.put(id,1);
				}
			}
			br.close();
			br = new BufferedReader(new FileReader("D:\\BridgeLabz-Training\\gcr-codebase\\csvdatahandling\\students.txt"));
			br.readLine();
			while((line=br.readLine())!=null) {
				String[] data = line.split(",");
				if(map.get(data[0])>1) {
					System.out.println("Duplicate record: " + line);
				}
			}
			br.close();
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
