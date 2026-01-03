class Course{
	String courseName;
	int duration;
	Course(String courseName, int duration){
		this.courseName = courseName;
		this.duration = duration;
	}
	void displayInfo() {
		System.out.println("Course Name: "+this.courseName);
		System.out.println("Duration: "+this.duration);
		System.out.println("----------------------------");
		System.out.println();
	}
}
class OnlineCourse extends Course{
	String platform;
	boolean isRecorded;
	OnlineCourse(String courseName, int duration,String platform,boolean isRecorded){
		super(courseName,duration);
		this.platform = platform;
		this.isRecorded = isRecorded;
	}
	void displayInfo() {
		System.out.println("Course Name: "+this.courseName);
		System.out.println("Duration: "+this.duration);
		System.out.println("Platform: "+this.platform);
		System.out.println("Is Recorded(True/False): "+this.isRecorded);
		System.out.println("----------------------------");
		System.out.println();
	}
}
class PaidOnlineCourse extends OnlineCourse{
	double fee;
	int discount;
	PaidOnlineCourse(String courseName, int duration,String platform,boolean isRecorded,double fee,int discount){
		super(courseName,duration,platform,isRecorded);
		this.fee = fee;
		this.discount = discount;
	}
	void displayInfo() {
		System.out.println("Course Name: "+this.courseName);
		System.out.println("Duration: "+this.duration);
		System.out.println("Platform: "+this.platform);
		System.out.println("Is Recorded(True/False): "+this.isRecorded);
		System.out.println("Fee: "+this.fee);
		System.out.println("Discount: "+this.discount+"%");
		System.out.println("----------------------------");
		System.out.println();
	}
}
public class EducationalCourseHierarchy {
	public static void main(String[] args) {
		System.out.println("Course: ");
		Course course = new Course("Java: the beginnery Guide",4);
		course.displayInfo();
		System.out.println("Online Course");
		OnlineCourse oc = new OnlineCourse("Java: the beginnery Guide",4,"zoom",true);
		oc.displayInfo();
		System.out.println("Paid Online Course: ");
		PaidOnlineCourse poc = new PaidOnlineCourse("Java: the beginnery Guide",4,"zoom",true,2000.0,10);
		poc.displayInfo();
	}
}
