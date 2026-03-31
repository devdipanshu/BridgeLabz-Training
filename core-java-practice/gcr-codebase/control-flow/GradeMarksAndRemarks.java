import java.util.Scanner;

public class GradeMarksAndRemarks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int physicsMarks = sc.nextInt();
		int chemistryMarks = sc.nextInt();
		int mathMarks = sc.nextInt();
		
		int totalMarks = (physicsMarks+chemistryMarks+mathMarks);
		int marksPercentage = totalMarks*100/300;
		
		if(marksPercentage>=80) {
			System.out.println("Marks: "+marksPercentage);
			System.out.println("Grade: A");
			System.out.println("Remark: Level 4, above agency-normalized standards");	
		}
		else if(marksPercentage>=70) {
			System.out.println("Marks: "+marksPercentage);
			System.out.println("Grade: B");
			System.out.println("Remark: Level 3, at agency-normalized standards");	
		}
		else if(marksPercentage>=60) {
			System.out.println("Marks: "+marksPercentage);
			System.out.println("Grade: C");
			System.out.println("Remark: Level 2, below, but approaching agency-normalized standards");	
		}
		else if(marksPercentage>=50) {
			System.out.println("Marks: "+marksPercentage);
			System.out.println("Grade: D");
			System.out.println("Remark: Level 1, well below agency-normalized standards");	
		}
		else if(marksPercentage>=40) {
			System.out.println("Marks: "+marksPercentage);
			System.out.println("Grade: E");
			System.out.println("Remark: Level 1-, too below agency-normalized standards");	
		}
		else {
			System.out.println("Marks: "+marksPercentage);
			System.out.println("Grade: R");
			System.out.println("Remark: Remedial standards");	
		}
		sc.close();
	}
}
