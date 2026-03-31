import java.util.Scanner;

public class AddUntilUserEnterZeroOrNegative {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double [] numbers = new double[10];
		double total = 0.0;
		int index = 0;
		double currentNumber = sc.nextDouble();
		while(true) {  //index<10 || currentNumber>10
			if(index>=10 || currentNumber<=0) {
				break;
			}
			else {
				numbers[index] = currentNumber;
			}
			currentNumber = sc.nextDouble();
			index++;
		}
		for(int i = 0;i<numbers.length;i++) {
			total+=numbers[i];
		}
		System.out.println("Sum of the elments is: "+total);
		sc.close();
	}
}
