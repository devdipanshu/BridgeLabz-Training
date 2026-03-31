import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ReadFileLineByLine {

    public static void readFile(String filePath) throws IOException {

        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);

        String line;

        while((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
        fr.close();
    }

    public static void main(String[] args) {

        try {
        	readFile("C:\\Users\\Dipanshu\\OneDrive\\Documents\\MIC_QUEST.txt");

        }
        catch(IOException e) {
            System.out.println("File error occurred");
        }
    }
}
