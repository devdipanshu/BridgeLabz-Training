
import java.util.*;
class Invoice{
	int id;
	Invoice(int id){
		this.id=id;
	}
}
public class InvoiceObjectCreation{
	public static void main(String[] args){
		ArrayList<Integer> list=new ArrayList<>();
		list.add(1001);
		list.add(1002);
		list.add(1003);
		list.stream().map(Invoice::new).forEach(i->System.out.println(i.id));
	}
}
