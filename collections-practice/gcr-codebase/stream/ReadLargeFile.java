import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ReadLargeFile{
    public static void main(String[] args){

        FileReader fr = null;
        BufferedReader br = null;

        try{
            fr = new FileReader("C:\\Users\\Dipanshu\\OneDrive\\Documents\\MIC_QUEST.txt");
            br = new BufferedReader(fr);

            String line;

            while((line = br.readLine()) != null){
                if(line.toLowerCase().contains("error")){
                    System.out.println(line);
                }
            }

        }catch(IOException e){
            System.out.println("IO Error occurred");
        }finally{
            try{
                if(br != null){
                    br.close();
                }
                if(fr != null){
                    fr.close();
                }
            }catch(IOException e){
                System.out.println("Error while closing streams");
            }
        }
    }
}
