import java.lang.reflect.Method;
import java.util.Scanner;
class MathOperations {
	public int add(int a,int b) {
		return a + b;
	}
	public int subtract(int a,int b) {
		return a - b;
	}
	public int multiply(int a,int b) {
		return a * b;
	}
}
public class DynamicMethodInvocation {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter method name: ");
			String methodName = sc.nextLine();
			System.out.println("Enter first number: ");
			int x = sc.nextInt();
			System.out.println("Enter second number: ");
			int y = sc.nextInt();
			MathOperations obj = new MathOperations();
			Class c = obj.getClass();
			Method m = c.getMethod(methodName,int.class,int.class);
			Object result = m.invoke(obj,x,y);
			System.out.println("Result : " + result);
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
