package employee_role;

public abstract class Employee {
	private final String name;
	private final double salary;
	protected final double bonus;

	Employee(String name,double salary,double bonus){
		this.name = name;
		this.salary = salary;
		this.bonus = bonus;
	}

	public double getSalary(){
		return salary;
	}

	public abstract double getBonus();
}
