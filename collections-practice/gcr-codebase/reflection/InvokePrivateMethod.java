import java.lang.reflect.Method;
class Calculator {
	private int multiply(int a,int b) {
		return a * b;
	}
}
public class InvokePrivateMethod {
	public static void main(String[] args) {
		try {
			Calculator c = new Calculator();
			Class cls = c.getClass();
			Method m = cls.getDeclaredMethod("multiply",int.class,int.class);
			m.setAccessible(true);
			Object result = m.invoke(c,3,11);
			System.out.println("Result : " + result);
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
