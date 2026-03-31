import java.io.BufferedReader;
import java.io.FileReader;
public class ReadCSV {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("D:\\BridgeLabz-Training\\gcr-codebase\\csvdatahandling\\students.txt"));
			String line;
			while((line=br.readLine())!=null) {
				String[] data = line.split(",");
				System.out.println("ID: " + data[0] + ", Name: " + data[1] + ", Age: " + data[2] + ", Marks: " + data[3]);
			}
			br.close();
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
