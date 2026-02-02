import java.io.FileWriter;
public class WriteCSV {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("D:\\BridgeLabz-Training\\gcr-codebase\\csvdatahandling\\employees.txt");
			fw.append("ID,Name,Department,Salary\n");
			fw.append("101,Dipanshu,IT,50000\n");
			fw.append("102,Sweta,HR,45000\n");
			fw.append("103,Prakhar,Finance,55000\n");
			fw.append("104,Rahul,Marketing,40000\n");
			fw.append("105,Anjali,IT,48000\n");
			fw.flush();
			fw.close();
			System.out.println("CSV file written successfully");
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
