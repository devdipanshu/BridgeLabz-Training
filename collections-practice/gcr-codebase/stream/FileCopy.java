
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy{
    public static void main(String[] args){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try{
            fis = new FileInputStream("C:\\Users\\Dipanshu\\OneDrive\\Documents\\MIC_QUEST.txt");
            fos = new FileOutputStream("C:\\Users\\Dipanshu\\OneDrive\\Documents\\prepro\\prepro\\api\\.venv\\Lib\\site-packages\\pip-24.2.dist-info\\top_level.txt");

            int data;

            while((data = fis.read()) != -1){
                fos.write(data);
            }

            System.out.println("File copied successfully");

        }catch(IOException e){
            System.out.println("Source file does not exist or error occurred");

        }finally{
            try{
                if(fis != null){
                    fis.close();
                }
                if(fos != null){
                    fos.close();
                }
            }catch(IOException e){
                System.out.println("Error while closing files");
            }
        }
    }
}
