import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;

public class UpperToLower{
    public static void main(String[] args){

        FileReader fr = null;
        FileWriter fw = null;

        BufferedReader br = null;
        BufferedWriter bw = null;

        try{
            fr = new FileReader("C:\\Users\\Dipanshu\\OneDrive\\Documents\\MIC_QUEST.txt");
            fw = new FileWriter("C:\\Users\\Dipanshu\\eclipse-workspace\\.metadata\\.plugins\\org.eclipse.jdt.core\\javaLikeNames.txt");

            br = new BufferedReader(fr);
            bw = new BufferedWriter(fw);

            int ch;

            while((ch = br.read()) != -1){
                bw.write(Character.toLowerCase((char)ch));
            }

            System.out.println("File converted successfully");

        }catch(IOException e){
            System.out.println("IO Error occurred");
        }finally{
            try{
                if(br != null){
                    br.close();
                }
                if(bw != null){
                    bw.close();
                }
                if(fr != null){
                    fr.close();
                }
                if(fw != null){
                    fw.close();
                }
            }catch(IOException e){
                System.out.println("Error while closing streams");
            }
        }
    }
}
