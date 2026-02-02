import java.io.BufferedReader;
import java.io.FileReader;
public class ReadLargeCSV {
	public static void main(String[] args) {
		int chunkSize = 100;
		int totalCount = 0;
		try {
			BufferedReader br = new BufferedReader(new FileReader("D:\\BridgeLabz-Training\\gcr-codebase\\csvdatahandling\\students.txt"));
			String header = br.readLine();
			String line;
			int chunkCount = 0;
			while(true) {
				chunkCount = 0;
				while(chunkCount<chunkSize && (line=br.readLine())!=null) {
					chunkCount++;
					totalCount++;
				}
				if(chunkCount==0) break;
				System.out.println("Processed " + totalCount + " records so far");
			}
			br.close();
			System.out.println("Total records processed: " + totalCount);
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
