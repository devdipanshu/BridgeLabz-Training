
import java.text.*;
import java.util.*;
interface DateUtils{
	static String format(Date d,String pattern){
		SimpleDateFormat sdf=new SimpleDateFormat(pattern);
		return sdf.format(d);
	}
}
public class DateFormatUtility{
	public static void main(String[] args){
		Date date=new Date();
		String[] patterns={"dd-MM-yyyy","yyyy/MM/dd","MMM dd,yyyy"};
		for(int i=0;i<patterns.length;i++){
			System.out.println(DateUtils.format(date,patterns[i]));
		}
	}
}
