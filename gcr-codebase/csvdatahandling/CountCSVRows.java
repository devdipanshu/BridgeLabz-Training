import java.io.BufferedReader;
import java.io.FileReader;
public class CountCSVRows {
	public static void main(String[] args) {
		int count = 0;
		try {
			BufferedReader br = new BufferedReader(new FileReader("D:\\BridgeLabz-Training\\gcr-codebase\\csvdatahandling\\employees.txt"));
			String line = br.readLine();
			while((line=br.readLine())!=null) {
				count++;
			}
			br.close();
			System.out.println("Number of records: " + count);
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
