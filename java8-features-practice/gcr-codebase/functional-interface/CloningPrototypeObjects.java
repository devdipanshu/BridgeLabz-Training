
class Prototype implements Cloneable{
	int id;
	Prototype(int id){
		this.id=id;
	}
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
public class CloningPrototypeObjects{
	public static void main(String[] args)throws Exception{
		Prototype p1=new Prototype(101);
		Prototype p2=(Prototype)p1.clone();
		System.out.println(p1.id);
		System.out.println(p2.id);
	}
}
