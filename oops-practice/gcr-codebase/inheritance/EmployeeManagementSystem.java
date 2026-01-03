class Employee{
	String name;
	int id;
	double salary;
	Employee(String name,int id,double salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	void displayDetails() {
		System.out.println("Employee name: "+this.name);
		System.out.println("Employee id: "+this.id);
		System.out.println("Employee salary: "+this.salary);
	}
}

class Manager extends Employee{
	int teamSize;
	Manager(String name,int id,double salary,int teamSize){
		super(name,id,salary);
		this.teamSize = teamSize;
	}
	void displayDetails() {
		System.out.println("Employee name: "+this.name);
		System.out.println("Employee id: "+this.id);
		System.out.println("Employee salary: "+this.salary);
		System.out.println("Team Size: "+this.teamSize);
	}
}
class Developer extends Employee{
	String programmingLanguage;
	Developer(String name,int id,double salary,String programmingLanguage){
		super(name,id,salary);
		this.programmingLanguage = programmingLanguage;
	}
	void displayDetails() {
		System.out.println("Employee name: "+this.name);
		System.out.println("Employee id: "+this.id);
		System.out.println("Programming Language: "+this.programmingLanguage);
	}
}
class Intern extends Employee{
	Intern(String name,int id,double salary){
		super(name,id,salary);
	}
}

public class EmployeeManagementSystem {
	public static void main(String[] args) {
		Manager manager = new Manager("Sahil",101,90000.0,7);
		Developer developer = new Developer("Dipanshu",102,70000.0,"java");
		Intern intern = new Intern("Prateek",103,0.0);
		manager.displayDetails();
		developer.displayDetails();
		intern.displayDetails();
	}
}
