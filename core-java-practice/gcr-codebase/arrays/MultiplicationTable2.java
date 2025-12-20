import java.util.Scanner;

public class MultiplicationTable2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		
		int[]multiplicationTable = new int[10];
		
		for(int i = 1;i<=10;i++) {
			multiplicationTable[i-1] = i*number;
		}
		
		for(int i = 0;i<multiplicationTable.length;i++) {
			System.out.println(number+" * "+(i+1)+" = "+multiplicationTable[i]);
		}
		sc.close();
	}
}
