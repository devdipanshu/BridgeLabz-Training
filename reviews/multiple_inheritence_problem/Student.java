package multiple_inheritence_problem;

class Student extends Course,College{ //Diamond Problem
	Student(String collegeName,String courseName){
		super(collegeName);
		super(courseName);
	}
	
}