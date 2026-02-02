import java.lang.reflect.Field;
class Person {
	private int age = 13;
}
public class AccessPrivateField {
	public static void main(String[] args) {
		try {
			Person p = new Person();
			Class c = p.getClass();
			Field f = c.getDeclaredField("age");
			f.setAccessible(true);
			f.setInt(p, 23);
			int value = f.getInt(p);
			System.out.println("Age : " + value);
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
