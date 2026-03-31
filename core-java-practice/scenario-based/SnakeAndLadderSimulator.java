import java.util.Scanner;

public class SnakeAndLadderSimulator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Use Case 1: Game played with single player at start position 0
		int pos = 0;
		
		//Use Case 2: Player rolls the die to get a number between 1 to 6
//		int num = (int)(Math.random()*6)+1;
		
		//Use Case 3: Check number of steps player have to move
//		System.out.println("0 means no play, 1 means ladder and 2 means snake");
//		System.out.println();
//		int step = (int)(Math.random()*3);
//		System.out.println("The Result is "+step);
		
		//Use Case 4: Repeat till the player reaches to the winning condition
//		while(pos!=100) {
//	    	System.out.println("Press x to roll a die");
//			String s = sc.next();
//			if(s.charAt(0) == 'x') {
//				int num = (int)(Math.random()*6)+1;
//				
//				System.out.println("0 means no play, 1 means ladder and 2 means snake");
//			    System.out.println();
//				int step = (int)(Math.random()*3);
//				System.out.println("The Result is "+step);
//				if(step == 0) {
//					pos+=0;
//				}
//				else if(step == 1) {
//					pos+=num;
//				}
//				else {
//					pos-=num;
//				}
//				if(pos<0) {
//					pos = 0;
//				}
//				
//				//Use Case 5: Ensure the player gets to exact winning position 100
//				if(pos>100) {
//					pos-=num;
//				}
//			}
//		}
		
		//Use Case 6: report the number of times the dice was played to win and also position after every game
//		int numOfDiceThrown = 0;
//		while(pos!=100) {
//	      	System.out.println("Press x to roll a die");
//			String s = sc.next();
//			if(s.charAt(0) == 'x') {
//				int num = (int)(Math.random()*6)+1;
//				System.out.println("You got the number "+num);
//				numOfDiceThrown++;
//				System.out.println("0 means no play, 1 means ladder and 2 means snake");
//			    System.out.println();
//				int step = (int)(Math.random()*3);
//				if(step == 0) {
//					System.out.println("The Result is "+step+" it means position doesnot change");
//					pos+=0;
//				}
//				else if(step == 1) {
//					System.out.println("The Result is "+step+" it means position will increase by "+num);
//					pos+=num;
//				}
//				else {
//					System.out.println("The Result is "+step+" it means position will decrease by "+num);
//					pos-=num;
//				}
//				if(pos<0) {
//					pos = 0;
//				}
//				if(pos>100) {
//					pos-=num;
//				}
//				System.out.println("Now the position is: "+pos);
//				System.out.println("-----------------------------");
//				System.out.println();
//			}
//		}
		
		
		
		//Use Case 7: Play the game with two players, if player get ladder then the player will get one more chance
		int posX = 0;
		int posY = 0;
		
		int numOfDiceThrownX = 0;
		int numOfDiceThrownY = 0;
		char chance = 'x';
		while(posX!=100 && posY!=100) {
			if(chance == 'x') {
				chance = 'y';
				System.out.println("              X TURN                  ");
				System.out.println("Player X have to Press x to roll a die");
				String s = "x"; //sc.next(); //For the real game uncomment sc.next(); i have hard coded it 
				                             //because i have to enter x so many times, it is for testing purpose
				                             //so that mentors can easily check the working
				if(s.charAt(0) == 'x') {
					
					int num = (int)(Math.random()*6)+1;
					System.out.println("You got the number "+num);
					System.out.println("Current Position of x is: "+posX);
					numOfDiceThrownX++;
					int step = (int)(Math.random()*3);
					if(step == 0) {
						System.out.println("The Result is No play");
						posX+=0;
					}
					else if(step == 1) {
						System.out.println("The Result is Ladder");
						posX+=num;
						chance = 'x';
					}
					else {
						System.out.println("The Result is Snake");
						posX-=num;
					}
					if(posX<0) {
						posX = 0;
					}
					if(posX>100) {
						posX-=num;
					}
					System.out.println("Now the position is of X is: "+posX);
					System.out.println("-----------------------------");
					System.out.println();
				}
				
			}
			else {
				chance = 'x';
				System.out.println("              Y TURN                  ");
				System.out.println("Player y have to Press y to roll a die");
				String s = "y";//sc.next(); //For the real game uncomment sc.next(); i have hard coded it
				                           //because i have to enter y so many times, it is for testing purpose 
				                           //so that mentors can easily check the working
				if(s.charAt(0) == 'y') {
					int num = (int)(Math.random()*6)+1;
					System.out.println("You got the number in dice is: "+num);
					System.out.println("Current Position is of y is: "+posY);
					numOfDiceThrownY++;
					int step = (int)(Math.random()*3);
					if(step == 0) {
						System.out.println("The Result is No play");
						posY+=0;
					}
					else if(step == 1) {
						System.out.println("The Result is Ladder");
						posY+=num;
						chance = 'y';
					}
					else {
						System.out.println("The Result is Snake");
						posY-=num;
					}
					if(posY<0) {
						posY = 0;
					}
					if(posY>100) {
						posY-=num;
					}
					System.out.println("Now the position of Y is: "+posY);
					System.out.println("-----------------------------");
					System.out.println();
				}
			}
		}
		if(posX==100) {
			
			System.out.println("X won the match and the number of times the dice was played to win "+numOfDiceThrownX);
		}
		else {
			System.out.println("Y won the match and the number of times the dice was played to win "+numOfDiceThrownY);
		}
		sc.close();
	}
}
