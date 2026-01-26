import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.IOException;

public class StudentData{
    public static void main(String[] args){

        DataOutputStream dos = null;
        DataInputStream dis = null;

        try{
            dos = new DataOutputStream(new FileOutputStream("C:\\Users\\Dipanshu\\eclipse-workspace\\.metadata\\.plugins\\org.eclipse.jdt.core\\javaLikeNames.txt"));

            dos.writeInt(101);
            dos.writeUTF("Amit");
            dos.writeDouble(8.5);

            dos.writeInt(102);
            dos.writeUTF("Neha");
            dos.writeDouble(9.1);

            dos.close();

            dis = new DataInputStream(new FileInputStream("student.dat"));

            System.out.println(dis.readInt() + " " + dis.readUTF() + " " + dis.readDouble());
            System.out.println(dis.readInt() + " " + dis.readUTF() + " " + dis.readDouble());

        }catch(IOException e){
            System.out.println("IO Error occurred");
        }finally{
            try{
                if(dos != null){
                    dos.close();
                }
                if(dis != null){
                    dis.close();
                }
            }catch(IOException e){
                System.out.println("Error while closing streams");
            }
        }
    }
}
