import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ImageByteArray{
    public static void main(String[] args){

        FileInputStream fis = null;
        FileOutputStream fos = null;

        ByteArrayOutputStream baos = null;
        ByteArrayInputStream bais = null;

        try{
            fis = new FileInputStream("C:\\Users\\Dipanshu\\OneDrive\\Pictures\\WhatsApp Image 2025-10-21 at 22.46.48_fc5eca98.jpg");
            baos = new ByteArrayOutputStream();

            int data;

            while((data = fis.read()) != -1){
                baos.write(data);
            }

            byte[] imageBytes = baos.toByteArray();

            bais = new ByteArrayInputStream(imageBytes);
            fos = new FileOutputStream("copy.jpg");

            while((data = bais.read()) != -1){
                fos.write(data);
            }

            System.out.println("Image copied successfully");

        }catch(IOException e){
            System.out.println("IO Error occurred");
        }finally{
            try{
                if(fis != null){
                    fis.close();
                }
                if(fos != null){
                    fos.close();
                }
                if(baos != null){
                    baos.close();
                }
                if(bais != null){
                    bais.close();
                }
            }catch(IOException e){
                System.out.println("Error while closing streams");
            }
        }
    }
}
