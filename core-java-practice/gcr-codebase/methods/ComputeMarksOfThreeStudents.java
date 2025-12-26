import java.util.Scanner;

public class ComputeMarksOfThreeStudents{
	public static int[][] generateScores(int students){
		int[][] scores=new int[students][3];
		for(int i=0;i<students;i++){
			for(int j=0;j<3;j++){
				scores[i][j]=(int)(Math.random()*91)+10;
			}
		}
		return scores;
	}
	public static double[][] calculateTotalAveragePercentage(int[][] scores){
		int students=scores.length;
		double[][] result=new double[students][3];
		for(int i=0;i<students;i++){
			int total=scores[i][0]+scores[i][1]+scores[i][2];
			double average=total/3.0;
			double percentage=total/300.0*100;
			result[i][0]=Math.round(total*100.0)/100.0;
			result[i][1]=Math.round(average*100.0)/100.0;
			result[i][2]=Math.round(percentage*100.0)/100.0;
		}
		return result;
	}
	public static String getGrade(double percentage){
		if(percentage>=80) return "A";
		else if(percentage>=70) return "B";
		else if(percentage>=60) return "C";
		else if(percentage>=50) return "D";
		else if(percentage>=40) return "E";
		else return "R";
	}
	public static void displayScorecard(int[][] scores,double[][] result){
		System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
		for(int i=0;i<scores.length;i++){
			System.out.print((i+1)+"\t");
			for(int j=0;j<3;j++){
				System.out.print(scores[i][j]+"\t");
			}
			for(int j=0;j<3;j++){
				System.out.print(result[i][j]+"\t");
			}
			System.out.println(getGrade(result[i][2]));
		}
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number of students: ");
		int students=sc.nextInt();
		int[][] scores=generateScores(students);
		double[][] result=calculateTotalAveragePercentage(scores);
		displayScorecard(scores,result);
		sc.close();
	}
}
