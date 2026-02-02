import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class SearchCSV {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee name to search: ");
		String name = sc.nextLine();
		try {
			BufferedReader br = new BufferedReader(new FileReader("D:\\BridgeLabz-Training\\gcr-codebase\\csvdatahandling\\employees.txt"));
			String line = br.readLine();
			boolean found = false;
			while((line=br.readLine())!=null) {
				String[] data = line.split(",");
				if(data[1].equalsIgnoreCase(name)) {
					System.out.println("Department: " + data[2] + ", Salary: " + data[3]);
					found = true;
					break;
				}
			}
			br.close();
			if(!found) {
				System.out.println("Employee not found");
			}
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
