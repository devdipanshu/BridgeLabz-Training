package multiple_inheritence_problem;

class Course{
	private String name = "Btech";
	Course(String name){
		this.name = name;
	}
	public void printValue() {
		System.out.println("Course Name: "+name);
	}
}