
import java.util.*;
public class BackgroundJobExecution{
	public static void main(String[] args){
		ArrayList<Runnable> jobs=new ArrayList<>();
		jobs.add(()->System.out.println("Sending emails"));
		jobs.add(()->System.out.println("Generating reports"));
		jobs.add(()->System.out.println("Database backup"));
		for(int i=0;i<jobs.size();i++){
			Thread t=new Thread(jobs.get(i));
			t.start();
		}
	}
}