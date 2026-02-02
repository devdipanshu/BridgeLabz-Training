import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class UpdateCSV {
	public static void main(String[] args) {
		ArrayList<String> rows = new ArrayList<>();
		try {
			BufferedReader br = new BufferedReader(new FileReader("D:\\BridgeLabz-Training\\gcr-codebase\\csvdatahandling\\employees.txt"));
			String header = br.readLine();
			rows.add(header);
			String line;
			while((line=br.readLine())!=null) {
				String[] data = line.split(",");
				if(data[2].equalsIgnoreCase("IT")) {
					int salary = Integer.parseInt(data[3]);
					salary = salary + (salary/10);
					data[3] = String.valueOf(salary);
				}
				rows.add(data[0]+","+data[1]+","+data[2]+","+data[3]);
			}
			br.close();
			FileWriter fw = new FileWriter("employees_updated.csv");
			for(int i=0;i<rows.size();i++) {
				fw.append(rows.get(i)+"\n");
			}
			fw.flush();
			fw.close();
			System.out.println("CSV updated successfully");

		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
