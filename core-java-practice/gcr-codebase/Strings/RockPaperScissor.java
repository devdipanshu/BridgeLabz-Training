import java.util.Scanner;

public class RockPaperScissor {
	public static int findComputerChoice() {
		int computerChoice = (int)(Math.random()*3);
		return computerChoice;
	}
	public static String findWinner(int yc,int cc) {
		if((yc == 0 && cc ==1)||(yc==1&&cc==2)||(yc==2 && cc ==0)) {
			return "computer";
		}
		else if(yc == cc) {
			return "draw";
		}
		else {
			return "you";
		}
	}
	public static void displayResult(int yc,int cc) {
		if((yc == 0 && cc ==1)||(yc==1&&cc==2)||(yc==2 && cc ==0)) {
			System.out.println("You Choose "+yc+" Computer Choose "+cc);
			System.out.println("Computer Won");
		}
		else if(yc==cc) {
			System.out.println("You Choose "+yc+" Computer Choose "+cc);	
			System.out.println("Draw");
		}
		else {
			System.out.println("You Choose "+yc+" Computer Choose "+cc);
			System.out.println("You Won");
		}
	}
	public static int findPercentage(int yp, int cp,int tp) {
		return yp*100/tp;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of games you want to play: ");
		int numberOfGames = sc.nextInt();
		System.out.println("Choose 0 for rock, 1 for paper and 2 for scissor");
		int yourPoint = 0;
		int computerPoint = 0;
		int totalPoint = 0;
		for(int i = 0;i<numberOfGames;i++) {
			System.out.println("Enter your choice ");
			int yourChoice = sc.nextInt();
			int computerChoice = findComputerChoice();
			displayResult(yourChoice,computerChoice);
			String result = findWinner(yourChoice,computerChoice);
			if(result.equals("you")) {
				yourPoint++;
				totalPoint++;
			}
			else if(result.equals("draw")) {
				totalPoint++;
			}
			else {
				computerPoint++;
				totalPoint++;
			}
			int winningPercentage = findPercentage(yourPoint,computerPoint,totalPoint);
			System.out.println("Your Points        Computer Points        Percentage Win");
			System.out.println(yourPoint+"                        "+computerPoint+"                    "+winningPercentage);
			 
		}
		sc.close();
	}
}
