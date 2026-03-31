import java.util.Scanner;

public class EduQuiz {
	public static int calculateScore(String[] correct, String[] student) {
		int score = 0;
		for(int i = 0;i<correct.length;i++) {
			if(student[i].equalsIgnoreCase(correct[i])) {
				score++;
			}
		}
		return score;
	}
	public static void printFeedback(String[] correct, String[] student) {
		for(int i = 0;i<correct.length;i++) {
			if(student[i].equalsIgnoreCase(correct[i])) {
				System.out.println("Question "+(i+1)+": Correct");
			} else {
				System.out.println("Question "+(i+1)+": Incorrect");
			}
		}
	}
	public static void showResult(int score, int total) {
		double percentage = (score * 100.0) / total;
		System.out.println("Score: "+score+"/"+total);
		System.out.println("Percentage: "+percentage+"%");

		if(percentage >= 40) {
			System.out.println("Result: PASS");
		} else {
			System.out.println("Result: FAIL");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] correctAnswers = {
			"A","B","C","D","A",
			"C","B","D","A","C"
		};

		String[] studentAnswers = new String[10];

		for(int i = 0;i<studentAnswers.length;i++) {
			System.out.println("Enter answer for Question "+(i+1)+": ");
			studentAnswers[i] = sc.next();
		}
		printFeedback(correctAnswers, studentAnswers);
		int score = calculateScore(correctAnswers, studentAnswers);
		showResult(score, correctAnswers.length);
		sc.close();
	}
}
