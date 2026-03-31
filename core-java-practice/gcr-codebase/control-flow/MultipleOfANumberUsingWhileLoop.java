import java.util.Scanner;

public class MultipleOfANumberUsingWhileLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(number>0 && number<=100) {
			int counter = 100;
			while(counter>0) {
				if(counter%number==0) {
					System.out.println(counter);
				}
				counter--;
			}
		}
		else {
			System.out.println("Number should be in between 0 and 100");
		}
		
		
		sc.close();
	}
}
