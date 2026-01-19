import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ReadFileUsingInputStreamReader {

    public static void readFile(String filePath) throws IOException {

        FileInputStream fis = new FileInputStream(filePath);
        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
        BufferedReader br = new BufferedReader(isr);

        String line;

        while((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
        isr.close();
        fis.close();
    }

    public static void main(String[] args) {

        try {
            readFile("C:/Users/Dipanshu/OneDrive/Documents/MIC_QUEST.txt");
        }
        catch(IOException e) {
            System.out.println("File or encoding error occurred");
        }
    }
}
