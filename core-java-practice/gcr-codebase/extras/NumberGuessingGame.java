import java.util.Scanner;

public class NumberGuessingGame {
	public static int guessByComputer(int start,int end) {
		int result = (int)(Math.random()*(end-start+1))+start;
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Think a number between 1 to 100");

		int start = 1;
		int end = 100;
		boolean flag = true;

		while(flag) {
			int result = guessByComputer(start,end);
			System.out.println("Computer guessed: "+result);
			System.out.println("Enter the feedback from high, low, and correct: ");
			String guess = sc.next();

			if(guess.equalsIgnoreCase("correct")) {
				System.out.println("Hurrah! I have guessed your number");
				flag = false;
			}
			else if(guess.equalsIgnoreCase("high")) {
				end = result-1;
			}
			else if(guess.equalsIgnoreCase("low")) {
				start = result+1;
			}
		}
		sc.close();
	}
}

