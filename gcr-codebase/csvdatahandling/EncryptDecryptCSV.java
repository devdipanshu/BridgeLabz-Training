import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Base64;

public class EncryptDecryptCSV {

	public static void main(String[] args) { 
		writeEncryptedCSV();
		readDecryptedCSV();
	}
	static void writeEncryptedCSV() {
		try {
			FileWriter fw = new FileWriter("employees_secure.csv");
			fw.write("id,name,salary,email\n");
			fw.write("1,Rahul,"+encrypt("50000")+","+encrypt("rahul@gmail.com")+"\n");
			fw.write("2,Amit,"+encrypt("65000")+","+encrypt("amit@gmail.com")+"\n");
			fw.write("3,Neha,"+encrypt("72000")+","+encrypt("neha@gmail.com")+"\n");
			fw.close();
		} catch(Exception e) {
			System.out.println(e);
		}
	}
	static void readDecryptedCSV() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("employees_secure.csv"));
			br.readLine();
			String line;
			while((line=br.readLine())!=null) {
				String[] data = line.split(",");
				System.out.println(data[0]+" "+data[1]+" "+decrypt(data[2])+" "+decrypt(data[3]));
			}
			br.close();

		} catch(Exception e) {
			System.out.println(e);
		}
	}
	static String encrypt(String value) {
		return Base64.getEncoder().encodeToString(value.getBytes());
	}
	static String decrypt(String value) {
		return new String(Base64.getDecoder().decode(value));
	}
}
