
import java.util.Scanner;

public class GradeAndPercentageOfStudents {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		
		int[] physics = new int[number];
		int[] chemistry = new int[number];
		int[] maths = new int[number];
		double[] percentage = new double[number];
		char[] grade = new char[number];
		
		for(int i = 0;i<number;i++) {
			int p = sc.nextInt();
			int c = sc.nextInt();
			int m = sc.nextInt();
			
			if(p<0 || c<0 || m<0) {
				i--;
				continue;
			}
			
			physics[i] = p;
			chemistry[i] = c;
			maths[i] = m;
		}
		
		for(int i = 0;i<number;i++) {
			int total = physics[i]+chemistry[i]+maths[i];
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
			System.out.println("Physics: "+physics[i]);
			System.out.println("Chemistry: "+chemistry[i]);
			System.out.println("Maths: "+maths[i]);
			System.out.println("Percentage: "+percentage[i]);
			System.out.println("Grade: "+grade[i]);
		}
		
		sc.close();
	}
}

