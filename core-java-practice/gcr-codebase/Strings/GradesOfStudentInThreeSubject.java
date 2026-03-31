import java.util.Scanner;

public class GradesOfStudentInThreeSubject {

	public static int[][] generateScores(int students) {
		int[][] scores = new int[students][3];
		for(int i = 0;i<students;i++) {
			for(int j = 0;j<3;j++) {
				scores[i][j] = (int)(Math.random()*100);
			}
		}
		return scores;
	}
	public static double[][] calculateResult(int[][] scores) {
		int students = scores.length;
		double[][] result = new double[students][3];
		for(int i = 0;i<students;i++) {
			double total = 0;
			for(int j = 0;j<3;j++) {
				total += scores[i][j];
			}
			double average = total/3;
			double percentage = total/3;
			total = Math.round(total*100.0)/100.0;
			average = Math.round(average*100.0)/100.0;
			percentage = Math.round(percentage*100.0)/100.0;
			result[i][0] = total;
			result[i][1] = average;
			result[i][2] = percentage;
			
		}
		return result;
	}

	public static String[] calculateGrade(double[][] result) {
		String[] grade = new String[result.length];
		for(int i = 0;i<result.length;i++) {
			double percentage = result[i][2];
			if(percentage >= 80) {
				grade[i] = "A";
			}
			else if(percentage >= 70) {
				grade[i] = "B";
			}
			else if(percentage >= 60) {
				grade[i] = "C";
			}
			else if(percentage >= 50) {
				grade[i] = "D";
			}
			else if(percentage >= 40) {
				grade[i] = "E";
			}
			else {
				grade[i] = "R";
			}
		}
		return grade;
	}

	public static void displayScoreCard(int[][] scores,double[][] result,String[] grade) {
		System.out.println("Phy  Chem  Math  Total  Avg  %  Grade");
		for(int i = 0;i<scores.length;i++) {
			System.out.println(scores[i][0]+"    "+scores[i][1]+"    "+scores[i][2]+"    "+result[i][0]+"    "+result[i][1]+"    "+result[i][2]+"    "+grade[i]);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students: ");
		int students = sc.nextInt();
		int[][] scores = generateScores(students);
		double[][] result = calculateResult(scores);
		String[] grade = calculateGrade(result);
		displayScoreCard(scores,result,grade);
		sc.close();
	}
}
