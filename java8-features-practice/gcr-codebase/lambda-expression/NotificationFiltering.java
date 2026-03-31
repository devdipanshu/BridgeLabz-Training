
import java.util.*;
import java.util.function.*;
public class NotificationFiltering{
	public static void main(String[] args){
		ArrayList<String> alerts=new ArrayList<>();
		alerts.add("Emergency");
		alerts.add("Appointment");
		alerts.add("Reminder");
		Predicate<String> p=a->a.equals("Emergency");
		for(int i=0;i<alerts.size();i++){
			if(p.test(alerts.get(i))){
				System.out.println(alerts.get(i));
			}
		}
	}
}
