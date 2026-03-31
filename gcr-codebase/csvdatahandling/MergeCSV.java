import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
public class MergeCSV {
	public static void main(String[] args) {
		HashMap<String,String[]> map1 = new HashMap<>();
		HashMap<String,String[]> map2 = new HashMap<>();
		try {
			BufferedReader br1 = new BufferedReader(new FileReader("D:\\BridgeLabz-Training\\gcr-codebase\\csvdatahandling\\students1.txt"));
			String header1 = br1.readLine();
			String line;
			while((line=br1.readLine())!=null) {
				String[] data = line.split(",");
				map1.put(data[0],data);
			}
			br1.close();
			BufferedReader br2 = new BufferedReader(new FileReader("D:\\BridgeLabz-Training\\gcr-codebase\\csvdatahandling\\students2.txt"));
			String header2 = br2.readLine();
			while((line=br2.readLine())!=null) {
				String[] data = line.split(",");
				map2.put(data[0],data);
			}
			br2.close();
			FileWriter fw = new FileWriter("merged_students.csv");
			fw.append("ID,Name,Age,Marks,Grade\n");
			for(String id : map1.keySet()) {
				if(map2.containsKey(id)) {
					String[] d1 = map1.get(id);
					String[] d2 = map2.get(id);
					fw.append(d1[0]+","+d1[1]+","+d1[2]+","+d2[1]+","+d2[2]+"\n");
				}
			}
			fw.flush();
			fw.close();
			System.out.println("CSV files merged successfully");
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
