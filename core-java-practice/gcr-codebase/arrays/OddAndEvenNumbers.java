import java.util.Scanner;

public class OddAndEvenNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		if(number<1) {
			System.err.println("Number should be natural number");
		}
		else {
			int size = (number/2)+1;
			int[] even = new int[size];
			int[]odd = new int[size];
			int oddIndex = 0;
			int evenIndex = 0;
			for(int i = 1;i<=number;i++) {
				if(i%2 == 0) {
					even[evenIndex] = i;
					evenIndex++;
				}
				else {
					odd[oddIndex] = i;
					oddIndex++;
				}
			}
			System.out.println("EVEN VALUES ARE: ");
			for(int i = 0;i<size;i++) {
				System.out.println(even[i]);
			}
			
			System.out.println("ODD VALUES ARE: ");
			for(int i = 0;i<size;i++) {
				System.out.println(odd[i]);
			}
		}
		sc.close();
	}
}
