package encapsulation_inheritance_polymorphism;

interface Department {
	void assignDepartment(String name);
	String getDepartmentDetails();
}

abstract class Employee {

	private int employeeId;
	private String name;
	private double baseSalary;

	Employee(int employeeId, String name, double baseSalary) {
		this.employeeId = employeeId;
		this.name = name;
		this.baseSalary = baseSalary;
	}

	abstract double calculateSalary();

	void displayDetails() {
		System.out.println("Employee Id: " + employeeId);
		System.out.println("Name: " + name);
		System.out.println("Base Salary: " + baseSalary);
		System.out.println("Final Salary: " + calculateSalary());
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getName() {
		return name;
	}

	public double getBaseSalary() {
		return baseSalary;
	}
}

class FullTimeEmployee extends Employee implements Department {

	String departmentName;
	int workingHours = 12;

	FullTimeEmployee(int employeeId, String name, double baseSalary) {
		super(employeeId, name, baseSalary);
	}

	double calculateSalary() {
		return workingHours * getBaseSalary();
	}

	public void assignDepartment(String name) {
		departmentName = name;
	}

	public String getDepartmentDetails() {
		return departmentName;
	}
}

class PartTimeEmployee extends Employee implements Department {

	String departmentName;
	int workingHours = 8;

	PartTimeEmployee(int employeeId, String name, double baseSalary) {
		super(employeeId, name, baseSalary);
	}

	double calculateSalary() {
		return workingHours * getBaseSalary();
	}

	public void assignDepartment(String name) {
		departmentName = name;
	}

	public String getDepartmentDetails() {
		return departmentName;
	}
}

public class EmployeeManagementSystem {

	public static void main(String[] args) {

		Employee e1 = new FullTimeEmployee(101, "Amit", 500);
		Employee e2 = new PartTimeEmployee(102, "Ravi", 300);

		((Department)e1).assignDepartment("IT");

		((Department) e2).assignDepartment("HR");

		Employee[] employees = new Employee[2];
		employees[0] = e1;
		employees[1] = e2;

		for(int i = 0;i<employees.length;i++) {
			employees[i].displayDetails();
			Department d = (Department) employees[i];
			System.out.println("Department: " + d.getDepartmentDetails());
			System.out.println("-------------------------");
		}
	}
}

