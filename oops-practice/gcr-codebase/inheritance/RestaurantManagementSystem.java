interface Worker{
	void performDuties();
}
class Person2{
	String name;
	int id;
	Person2(String name,int id){
		this.name = name;
		this.id = id;
	}
}
class Chef extends Person2 implements Worker{
	String specialization;
	Chef(String name,int id,String specialization){
		super(name,id);
		this.specialization = specialization;
	}
	public void performDuties(){
		System.out.println("Role: Chef");
		System.out.println("Name: "+this.name);
		System.out.println("ID: "+this.id);
		System.out.println("Specialization: "+this.specialization);
		System.out.println("Duty: Cooking food");
		System.out.println("-------------------------");
		System.out.println();
	}
}
class Waiter extends Person2 implements Worker{
	int experience;
	Waiter(String name,int id,int experience){
		super(name,id);
		this.experience = experience;
	}
	public void performDuties(){
		System.out.println("Role: Waiter");
		System.out.println("Name: "+this.name);
		System.out.println("ID: "+this.id);
		System.out.println("Experience: "+this.experience+" years");
		System.out.println("Duty: Serving food");
		System.out.println("-------------------------");
		System.out.println();
	}
}
public class RestaurantManagementSystem{
	public static void main(String[] args){
		Chef chef = new Chef("Ramesh",101,"Indian Cuisine");
		Waiter waiter = new Waiter("Sohan",102,3);
		
		chef.performDuties();
		waiter.performDuties();
	}
}
