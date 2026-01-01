public class Employee {

	static String companyName;
	static int totalEmployees;

	String name;
	final int id;
	String designation;

	static void displayTotalEmployees() {
		System.out.println("Total Employees: "+ totalEmployees);
	}
	public Employee(String companyName, int id, String name, String designation) {
		Employee.companyName = companyName;
		this.id = id;
		this.name = name;
		this.designation = designation;
		totalEmployees++;
	}

	public void display(Employee emp) {
		if(emp instanceof Employee) {
			System.out.println("Company Name: " + companyName);
			System.out.println("Employee ID: " + emp.id);
			System.out.println("Name: " + emp.name);
			System.out.println("Designation: " + emp.designation);
		}
	}

	public static void main(String[] args) {

		Employee e1 = new Employee("Tech Solutions Inc.", 101, "Thamarai", "Software Engineer");
		Employee e2 = new Employee("Tech Solutions Inc.", 102, "Rohan", "Project Manager");
		displayTotalEmployees();
		e1.display(e1);
		e2.display(e2);
	}
}
