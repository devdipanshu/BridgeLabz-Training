import java.util.Scanner;

public class StringIndexOutOfBoundsExceptionHandler {
	public static void generateException(String str) {
		System.out.println(str.charAt(str.length()));
	}
	
	public static void handleException(String str) {
		try {
			generateException(str);
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("String index out of bounds exception handeled");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		
		// generateException(text);   //if the comment is removed then it cause an error
		handleException(text);
		
		sc.close();
	}
}
