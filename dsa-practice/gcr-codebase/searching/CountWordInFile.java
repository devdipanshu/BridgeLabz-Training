import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class CountWordInFile {

    public static void countWord(String filePath, String targetWord) throws IOException {

        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);
        String line;
        int count = 0;
        while((line = br.readLine()) != null) {
            String[] words = line.split(" ");
            for(int i = 0;i < words.length;i++) {
                if(words[i].equals(targetWord)) {
                    count++;
                }
            }
        }
        br.close();
        fr.close();
        System.out.println("Word '" + targetWord + "' found " + count + " times");
    }

    public static void main(String[] args) {
        try {
            countWord(
                "C:/Users/Dipanshu/OneDrive/Documents/MIC_QUEST.txt",
                "a"
            );
        }
        catch(IOException e) {
            System.out.println("File error occurred");
        }
    }
}
