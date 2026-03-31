import java.io.*;
import java.util.*;

public class WordFrequencyCounter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file path: ");
        String filePath = sc.nextLine();

        HashMap<String, Integer> freqMap = new HashMap<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            while((line = br.readLine()) != null) {
                line = line.replaceAll("[^a-zA-Z0-9 ]", "").toLowerCase();
                String[] words = line.split("\\s+");
                for(String word : words) {
                    if(word.isEmpty()) continue;
                    freqMap.put(word, freqMap.getOrDefault(word, 0) + 1);
                }
            }
            br.close();
            for(String key : freqMap.keySet()) {
                System.out.println(key + "=" + freqMap.get(key));
            }
        } catch(IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
