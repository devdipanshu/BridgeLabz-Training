import java.util.Scanner;

public class StudentScoreAnalyzer {
	
	public static float calculateAverage(int[] scores) {
		int sum = 0;
		for(int i = 0;i<scores.length;i++) {
			sum += scores[i];
		}
		return (float)sum / scores.length;
	}
	
	public static int[] findHighestAndLowest(int[] scores) {
		int highest = scores[0];
		int lowest = scores[0];
		
		for(int i = 1;i<scores.length;i++) {
			if(scores[i] > highest) {
				highest = scores[i];
			}
			if(scores[i] < lowest) {
				lowest = scores[i];
			}
		}
		int[] result = {highest, lowest};
		return result;
	}
	
	public static void displayAboveAverage(int[] scores, float avg) {
		System.out.println("Scores above average:");
		for(int i = 0;i<scores.length;i++) {
			if(scores[i] > avg) {
				System.out.println(scores[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		while(true) {
			try {
				System.out.println("Enter number of students: ");
				n = sc.nextInt();
				if(n <= 0) {
					System.out.println("Number must be positive");
					continue;
				}
				break;
			} catch(Exception e) {
				System.out.println("Invalid input");
				sc.next();
			}
		}
		
		int[] scores = new int[n];
		
		for(int i = 0;i<n;i++) {
			while(true) {
				try {
					System.out.println("Enter score of student "+(i+1));
					scores[i] = sc.nextInt();
					if(scores[i] < 0) {
						System.out.println("Score cannot be negative");
						continue;
					}
					break;
				} catch(Exception e) {
					System.out.println("Invalid input");
					sc.next();
				}
			}
		}
		float avg = calculateAverage(scores);
		int[] highLow = findHighestAndLowest(scores);
		System.out.println("Average Score: " + avg);
		System.out.println("Highest Score: " + highLow[0]);
		System.out.println("Lowest Score: " + highLow[1]);
		displayAboveAverage(scores, avg);
		sc.close();
	}
}
