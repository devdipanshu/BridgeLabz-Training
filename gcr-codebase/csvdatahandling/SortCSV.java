import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortCSV {

	public static void main(String[] args) {

		ArrayList<String[]> rows = new ArrayList<>();

		try {
			BufferedReader br = new BufferedReader(new FileReader("D:\\BridgeLabz-Training\\gcr-codebase\\csvdatahandling\\employees.txt"));
			String header = br.readLine();
			String line;
			while((line=br.readLine())!=null) {
				String[] data = line.split(",");
				rows.add(data);
			}
			br.close();
			Collections.sort(rows,new Comparator<String[]>() {
				public int compare(String[] a,String[] b) {
					return Integer.parseInt(b[3]) - Integer.parseInt(a[3]);
				}
			});

			System.out.println(header);
			for(int i=0;i<5 && i<rows.size();i++) {
				String[] data = rows.get(i);
				System.out.println(data[0]+","+data[1]+","+data[2]+","+data[3]);
			}

		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
