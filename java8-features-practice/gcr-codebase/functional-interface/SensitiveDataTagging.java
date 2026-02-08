
interface SensitiveData{
}
class Employee implements SensitiveData{
	String name;
	int salary;
	Employee(String name,int salary){
		this.name=name;
		this.salary=salary;
	}
}
class Customer{
	String name;
	String email;
	Customer(String name,String email){
		this.name=name;
		this.email=email;
	}
}
public class SensitiveDataTagging{
	public static void main(String[] args){
		Object[] data={new Employee("Rahul",50000),new Customer("Aman","a@example.com")};
		for(int i=0;i<data.length;i++){
			if(data[i] instanceof SensitiveData){
				System.out.println("Encrypt "+data[i].getClass().getSimpleName());
			}else{
				System.out.println("No encryption "+data[i].getClass().getSimpleName());
			}
		}
	}
}
