import java.util.Scanner;

public class CheckIfStudentCanVote {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[]studentsAge = new int[10];
		for(int i = 0;i<studentsAge.length;i++) {
			System.out.println("Enter the Age of the students"+i);
			studentsAge[i] = sc.nextInt();
		}
		
		for(int i = 0;i<studentsAge.length;i++) {
			if(studentsAge[i]<0) {
				System.out.println("Invalid Age");
			}
			else if(studentsAge[i]<18) {
				System.out.println("The student with the age "+studentsAge[i]+" cannot vote.");
			}
			else {
				System.out.println("The student with the age "+studentsAge[i]+" can vote.");
			}
		}
		sc.close();
	}
}
