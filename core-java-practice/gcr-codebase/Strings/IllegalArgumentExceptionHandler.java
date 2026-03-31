import java.util.Scanner;


public class IllegalArgumentExceptionHandler {

	public static void generateException(String word,int start,int end) {
		if(start > end || start < 0 || end > word.length()) {
			throw new IllegalArgumentException();
		}
		
	}


	public static void handleException(String word,int start,int end) {
		try {
			generateException(word,start,end);
		}

		catch(IllegalArgumentException e) {
			System.out.println("Illegal Argument Exception Handled");
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		int start = sc.nextInt();
		int end = sc.nextInt();

		// generateException(word,start,end); // if i remove the comment then it will cause runtime exception
		handleException(word,start,end);

		sc.close();
	}
}
