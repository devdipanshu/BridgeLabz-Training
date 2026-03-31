import java.util.Scanner;

public class StudentVoteChecker {
	public static boolean canStudentVote(int age) {
		if(age < 0) {
			return false;
		}
		if(age >= 18) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] ages = new int[10];

		for(int i = 0;i<ages.length;i++) {
			ages[i] = sc.nextInt();
		}

		for(int i = 0;i<ages.length;i++) {
			boolean status = canStudentVote(ages[i]);
			if(status) {
				System.out.println("Student "+(i+1)+" can vote");
			}
			else {
				System.out.println("Student "+(i+1)+" cannot vote");
			}
		}
		sc.close();
	}
}
