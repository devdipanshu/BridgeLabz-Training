class FileDownloaderThread extends Thread{

    String fileName;

    FileDownloaderThread(String fileName){
        this.fileName=fileName;
    }

    public void run(){
        for(int i=0;i<=100;i+=25){
            try{
                Thread.sleep((int)(Math.random()*500));
            }catch(Exception e){}
            System.out.println("["+Thread.currentThread().getName()+"] Downloading "+fileName+": "+i+"%");
        }
    }
}

public class DownloadManagerThreadApproach{
    public static void main(String[] args) throws Exception{

        FileDownloaderThread t1=new FileDownloaderThread("Document.pdf");
        FileDownloaderThread t2=new FileDownloaderThread("Image.jpg");
        FileDownloaderThread t3=new FileDownloaderThread("Video.mp4");

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("All downloads complete!");
    }
}
