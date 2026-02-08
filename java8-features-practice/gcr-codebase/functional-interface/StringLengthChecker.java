
import java.util.*;
import java.util.function.*;
public class StringLengthChecker{
	public static void main(String[] args){
		ArrayList<String> msgs=new ArrayList<>();
		msgs.add("Hello");
		msgs.add("This is a long message");
		msgs.add("OK");
		Function<String,Integer> f=s->s.length();
		for(int i=0;i<msgs.size();i++){
			if(f.apply(msgs.get(i))>10){
				System.out.println(msgs.get(i));
			}
		}
	}
}
