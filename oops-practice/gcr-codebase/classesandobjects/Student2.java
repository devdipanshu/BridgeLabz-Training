public class Student2 {
	public int rollNumber;
	protected String name;  
	private double CGPA;
	
	Student2(int rollNumber, String name, double CGPA){
		this.rollNumber = rollNumber;
		this.name = name;
		setCGPA(CGPA);
	}
	public void setCGPA(double CGPA) {
		this.CGPA = CGPA;
	}
	public double getCGPA() {
		return this.CGPA;
	}
}

class PostgraduateStudent extends Student2 {
	PostgraduateStudent(int rollNumber, String name, double CGPA){
		super(rollNumber, name, CGPA);
	}
	public void displayPostgraduateStudent() {
		System.out.println("Roll Number: "+this.rollNumber);
		System.out.println("Name: "+this.name);
		System.out.println("CGPA: "+this.getCGPA());
		System.out.println("------------------------");
	}
	public static void main(String[] args) {
		PostgraduateStudent pg = new PostgraduateStudent(101,"Dipanshu",8.5);
		pg.displayPostgraduateStudent();
	}
}
