import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

public class BufferedFileCopy{
    public static void main(String[] args){

        FileInputStream fis = null;
        FileOutputStream fos = null;

        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        byte[] buffer = new byte[4096];
        int bytesRead;

        long startTime;
        long endTime;

        try{
            fis = new FileInputStream("C:\\Users\\Dipanshu\\OneDrive\\Documents\\MIC_QUEST.txt");
            fos = new FileOutputStream("C:\\Users\\Dipanshu\\OneDrive\\Documents\\prepro\\prepro\\api\\.venv\\Lib\\site-packages\\pip-24.2.dist-info\\top_level.txt");

            startTime = System.nanoTime();

            while((bytesRead = fis.read(buffer)) != -1){
                fos.write(buffer, 0, bytesRead);
            }

            endTime = System.nanoTime();

            System.out.println("Normal Stream Time (ns): " + (endTime - startTime));

            fis.close();
            fos.close();

            fis = new FileInputStream("source.txt");
            fos = new FileOutputStream("buffered_copy.txt");

            bis = new BufferedInputStream(fis);
            bos = new BufferedOutputStream(fos);

            startTime = System.nanoTime();

            while((bytesRead = bis.read(buffer)) != -1){
                bos.write(buffer, 0, bytesRead);
            }

            endTime = System.nanoTime();

            System.out.println("Buffered Stream Time (ns): " + (endTime - startTime));

        }catch(IOException e){
            System.out.println("File error or IO problem");

        }finally{
            try{
                if(bis != null){
                    bis.close();
                }
                if(bos != null){
                    bos.close();
                }
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
