public class Course {
	String courseName;
	int duration;
	double fee;
	static String instituteName = "GLA University";
	Course(String courseName,int duration,double fee) {
		this.courseName = courseName;
		this.duration = duration;
		this.fee = fee;
	}
	public void displayCourseDetails() {
		System.out.println("Institute Name: "+instituteName);
		System.out.println("Course Name: "+this.courseName);
		System.out.println("Duration: "+this.duration+" months");
		System.out.println("Fee: "+this.fee);
		System.out.println("-------------------------------");
		System.out.println();
	}
	public static void updateInstituteName(String newInstituteName) {
		instituteName = newInstituteName;
	}
	public static void main(String[] args) {
		Course c1 = new Course("Java Full Stack",6,45000.0);
		Course c2 = new Course("Python",4,30000.0);
		c1.displayCourseDetails();
		c2.displayCourseDetails();
		Course.updateInstituteName("Bridge Labz");
		c1.displayCourseDetails();
		c2.displayCourseDetails();
	}
}
