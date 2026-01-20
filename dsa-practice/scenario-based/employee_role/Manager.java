package employee_role;

public class Manager extends Employee {

	Manager(String name,double salary){
		super(name,salary,salary * 0.10);
	}

	public double getBonus(){
		return bonus;
	}
}
