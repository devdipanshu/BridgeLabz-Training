package multiple_inheritence_problem;

class College{
	private String name = "GLA";
	College(String name){
		this.name = name;
	}
	
	public void printValue() {
		System.out.println("Course Name: "+name);
	}
}