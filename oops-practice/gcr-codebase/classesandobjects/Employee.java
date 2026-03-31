public class Employee {
	String name;
	int id;
	int salary;
	
	Employee(String name,int id,int salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public void DisplayDetails() {
		System.out.println("Employee Name: "+this.name);
		System.out.println("Employee id: "+this.id);
		System.out.println("Employee Salary: "+this.salary);
	}
	public static void main(String[] args) {
		Employee e1 = new Employee("Rohan",1,500000);
		e1.DisplayDetails();
	}
}

