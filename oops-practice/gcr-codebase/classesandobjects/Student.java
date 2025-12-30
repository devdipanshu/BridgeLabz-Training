public class Student {
	String name;
	String rollNumber;
	double mark1;
	double mark2;
	double mark3;
	char grade;
	
	Student(String name,String rollNumber,double mark1,double mark2,double mark3){
		this.name = name;
		this.rollNumber = rollNumber;
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
	}
	
	public void calculateGrade() {
		double average = (this.mark1 + this.mark2 + this.mark3)/3;
		
		if(average >= 80) {
			this.grade = 'B';
		}
		else if(average >= 60) {
			this.grade = 'C';
		}
		else {
			this.grade = 'D';
		}
	}
	
	public void DisplayStudentDetails() {
		System.out.println("Student Name: "+this.name);
		System.out.println("Student RollNumber: "+this.rollNumber);
		System.out.println("Student Marks:");
		System.out.println("Mark1: "+this.mark1);
		System.out.println("Mark2: "+this.mark2);
		System.out.println("Mark3: "+this.mark3);
		System.out.println("Grade "+this.grade);
	}
	
	public static void main(String[] args) {
		Student s1 = new Student("Thamarai","ECE001",80.0,70.0,75.0);
		s1.calculateGrade();
		s1.DisplayStudentDetails();
		
		Student s2 = new Student("Kannan","CSC002",60.0,65.0,50.0);
		s2.calculateGrade();
		s2.DisplayStudentDetails();
	}
}

