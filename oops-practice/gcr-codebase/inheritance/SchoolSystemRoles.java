class Person{
	String name;
	int age;
	Person(String name,int age){
		this.name = name;
		this.age = age;
	}
}
class Teacher extends Person{
	String subject;
	Teacher(String name,int age,String subject){
		super(name,age);
		this.subject = subject;
	}
	void displayRole(){
		System.out.println("Role: Teacher");
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+this.age);
		System.out.println("Subject: "+this.subject);
		System.out.println("-------------------------");
		System.out.println();
	}
}
class Student extends Person{
	String grade;
	Student(String name,int age,String grade){
		super(name,age);
		this.grade = grade;
	}
	void displayRole(){
		System.out.println("Role: Student");
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+this.age);
		System.out.println("Grade: "+this.grade);
		System.out.println("-------------------------");
		System.out.println();
	}
}
class Staff extends Person{
	String department;
	Staff(String name,int age,String department){
		super(name,age);
		this.department = department;
	}
	void displayRole(){
		System.out.println("Role: Staff");
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+this.age);
		System.out.println("Department: "+this.department);
		System.out.println("-------------------------");
		System.out.println();
	}
}

public class SchoolSystemRoles{
	public static void main(String[] args){
		Teacher teacher = new Teacher("Rahul",35,"Mathematics");
		Student student = new Student("Aman",16,"10th");
		Staff staff = new Staff("Suresh",40,"Administration");
		teacher.displayRole();
		student.displayRole();
		staff.displayRole();
	}
}
