import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Pattern;

public class ValidateCSV {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("D:\\BridgeLabz-Training\\gcr-codebase\\csvdatahandling\\users.txt"));
			String header = br.readLine();
			System.out.println(header);
			String line;
			Pattern emailPattern = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");
			Pattern phonePattern = Pattern.compile("^\\d{10}$");
			while((line=br.readLine())!=null) {
				String[] data = line.split(",");
				String email = data[2];
				String phone = data[3];
				boolean valid = true;
				if(!emailPattern.matcher(email).matches()) {
					System.out.println("Invalid email in row: " + line);
					valid = false;
				}
				if(!phonePattern.matcher(phone).matches()) {
					System.out.println("Invalid phone number in row: " + line);
					valid = false;
				}
				if(valid) {
					System.out.println("Valid row: " + line);
				}
			}
			br.close();
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
