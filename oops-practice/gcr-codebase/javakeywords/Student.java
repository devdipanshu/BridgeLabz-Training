public class Student {
	static String universityName = "GLA University";
	static int totalStudents = 0;
	String name;
	final int rollNumber;
	char grade;
	Student(String name,int rollNumber,char grade){
		this.name = name;
		this.rollNumber = rollNumber;
		this.grade = grade;
		totalStudents++;
	}
	static void displayTotalStudents(){
		System.out.println("Total Students: "+totalStudents);
	}
	void display(Student obj){
		if(obj instanceof Student){
			System.out.println("University Name: "+universityName);
			System.out.println("Student Name: "+name);
			System.out.println("Roll Number: "+rollNumber);
			System.out.println("Grade: "+grade);
		}
		else {
			System.out.println();
		}
	}
	void updateGrade(Student student,char newGrade){
		if(student instanceof Student){
			this.grade = newGrade;
		}
	}
	public static void main(String[] args) {
		Student s1 = new Student("Aman",101,'A');
		Student s2 = new Student("Rohit",102,'B');

		s1.display(s1);
		s2.display(s2);
		displayTotalStudents();
		s1.updateGrade(s1,'A');
		System.out.println("After Grade Update:");
		s1.display(s1);
	}
}
