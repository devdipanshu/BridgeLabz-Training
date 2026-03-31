
public class NullPointerExceptionHandler {
	public static void generateException() {
		String text = null;
		System.out.println(text.length());
	}
	public static void main(String[] args) {
		String text = null;
		try {
			generateException();
		}
		catch(NullPointerException e) {
			System.out.println("Null Pointer Exception Handeled Successfully");
		}
		
	}
}
