
import java.util.*;
public class NameUppercasing{
	public static void main(String[] args){
		ArrayList<String> list=new ArrayList<>();
		list.add("rahul");
		list.add("aman");
		list.add("neha");
		list.stream().map(String::toUpperCase).forEach(System.out::println);
	}
}
