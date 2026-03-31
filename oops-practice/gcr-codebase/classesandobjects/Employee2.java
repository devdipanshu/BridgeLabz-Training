public class Employee2 {
	public int employeeID;
	protected String department;
	private double salary;
	Employee2(int employeeID, String department, double salary){
		this.employeeID = employeeID;
		this.department = department;
		setSalary(salary);
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double getSalary() {
		return this.salary;
	}
}

class Manager extends Employee2 {
	
	Manager(int employeeID, String department, double salary){
		super(employeeID, department, salary);
	}
	public void display() {
		System.out.println("Employee ID: "+employeeID);
		System.out.println("Department: "+department);
		System.out.println("Salary: "+getSalary());
		System.out.println("------------------------");
	}
	public static void main(String[] args) {
		Manager manager = new Manager(201,"IT",60000.0);
		manager.display();
		manager.setSalary(75000.0);
		manager.display();
	}
}
