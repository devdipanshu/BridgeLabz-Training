import java.util.Scanner;

public class NumberIsPositiveOrNegative {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[]numbers = new int[5];
		for(int i = 0;i<numbers.length;i++) {
			System.out.println("Enter the number"+i);
			numbers[i] = sc.nextInt();
		}
		
		for(int i = 0;i<numbers.length;i++) {
			if(numbers[i] == 0) {
				System.out.println("Zero");
			}
		    else if(numbers[i]>0) {
		    	if(numbers[i]%2==0) {
		    		System.out.println("Even");
		    	}
		    	else {
		    		System.out.println("Odd");
		    	}
		    }
		    else {
		    	System.out.println("Negative");
		    }
		}
		sc.close();
		
	}
}
