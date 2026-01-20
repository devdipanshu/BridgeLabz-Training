package employee_role;

public class Developer extends Employee {

	Developer(String name,double salary){
		super(name,salary,(salary > 50000) ? salary * 0.05 : 0.0);
	}

	public double getBonus(){
		return bonus;
	}
}
