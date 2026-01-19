package solve_multiple_inheritance_problem;

public class Student implements Course,College{
	public void setCourseName(String name) {
		System.out.println("Course Name "+name+" is set as course name");
	}
	public void setCollegeName(String name) {
		System.out.println("College Name is"+name+" is set as college name");
	}
	public void printGreeting() {
		System.out.println("Hello");
	}
}
