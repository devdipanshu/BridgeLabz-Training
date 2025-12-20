
import java.util.Scanner;

public class GradeAndPercentageOfStudentsExtended {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		int[][] marks = new int[number][3];
		double[] percentage = new double[number];
		char[] grade = new char[number];
		
		for(int i = 0;i<number;i++) {
			int physics = sc.nextInt();
			int chemistry = sc.nextInt();
			int maths = sc.nextInt();
			
			if(physics<0 || chemistry<0 || maths<0) {
				i--;
				continue;
			}
			
			marks[i][0] = physics;
			marks[i][1] = chemistry;
			marks[i][2] = maths;
		}
		
		for(int i = 0;i<number;i++) {
			int total = marks[i][0]+marks[i][1]+marks[i][2];
			percentage[i] = total/3.0;
			
			if(percentage[i]>=90) {
				grade[i] = 'A';
			}
			else if(percentage[i]>=75) {
				grade[i] = 'B';
			}
			else if(percentage[i]>=60) {
				grade[i] = 'C';
			}
			else if(percentage[i]>=40) {
				grade[i] = 'D';
			}
			else {
				grade[i] = 'F';
			}
		}
		
		for(int i = 0;i<number;i++) {
			System.out.println("Physics: "+marks[i][0]);
			System.out.println("Chemistry: "+marks[i][1]);
			System.out.println("Maths: "+marks[i][2]);
			System.out.println("Percentage: "+percentage[i]);
			System.out.println("Grade: "+grade[i]);
		}
		
		sc.close();
	}
}
