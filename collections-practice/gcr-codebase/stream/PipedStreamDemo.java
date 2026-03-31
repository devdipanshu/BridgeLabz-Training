import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.IOException;

public class PipedStreamDemo{
    public static void main(String[] args){

        try{
            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream(pos);

            WriteThread wt = new WriteThread(pos);
            ReadThread rt = new ReadThread(pis);

            wt.start();
            rt.start();

        }catch(IOException e){
            System.out.println("Pipe connection error");
        }
    }
}

class WriteThread extends Thread{

    PipedOutputStream pos;

    WriteThread(PipedOutputStream pos){
        this.pos = pos;
    }

    public void run(){
        try{
            String msg = "Hello from Writer Thread";
            pos.write(msg.getBytes());
            pos.close();
        }catch(IOException e){
            System.out.println("Write error");
        }
    }
}

class ReadThread extends Thread{

    PipedInputStream pis;

    ReadThread(PipedInputStream pis){
        this.pis = pis;
    }

    public void run(){
        try{
            int data;
            while((data = pis.read()) != -1){
                System.out.print((char)data);
            }
            pis.close();
        }catch(IOException e){
            System.out.println("Read error");
        }
    }
}
