import java.util.Scanner;

public class FestivalLuckyDraw {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 1;
		while(num != 0) {
			System.out.println("Draw a number(if you want to exit then enter 0): ");
			num = sc.nextInt();
			if(num < 0) {
				System.out.println("oops! you have entered invalid number");
				continue;
			}
			if(num == 0) {
				break;
			}
			if(num%3==0 &&num%5==0) {
				System.out.println("Yeeeey! you won the gift");
			}
			else {
				System.out.println("Better luck next time");
			}
		}
		System.out.println("Thankyou for visiting us");
		sc.close();
	}
}
