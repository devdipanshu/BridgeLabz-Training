import java.io.*;

public class FileReadingComparison {

    static void readUsingFileReader(String path) throws Exception{
        FileReader fr = new FileReader(path);
        int ch;
        while((ch = fr.read()) != -1){
        }
        fr.close();
    }

    static void readUsingInputStreamReader(String path) throws Exception{
        InputStreamReader isr = new InputStreamReader(new FileInputStream(path));
        int ch;
        while((ch = isr.read()) != -1){
        }
        isr.close();
    }

    public static void main(String[] args) throws Exception{

    	String filePath = "C:\\Users\\Dipanshu\\OneDrive\\Documents\\MIC_QUEST.txt";


        long startFR = System.nanoTime();
        readUsingFileReader(filePath);
        long endFR = System.nanoTime();

        System.out.println("FileReader Time (ns): " + (endFR - startFR));

        long startISR = System.nanoTime();
        readUsingInputStreamReader(filePath);
        long endISR = System.nanoTime();

        System.out.println("InputStreamReader Time (ns): " + (endISR - startISR));
    }
}
