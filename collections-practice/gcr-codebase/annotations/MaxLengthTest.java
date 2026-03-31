import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface MaxLength {
	int value();
}

class User {

	String username;

	User(String username) {
		this.username = username;
		Class c = this.getClass();
		Field[] f = c.getDeclaredFields();
		for(int i=0;i<f.length;i++) {
			if(f[i].isAnnotationPresent(MaxLength.class)) {
				MaxLength ml = (MaxLength)f[i].getAnnotation(MaxLength.class);
				try {
					f[i].setAccessible(true);
					Object val = f[i].get(this);
					if(val instanceof String) {
						if(((String)val).length() > ml.value()) {
							throw new IllegalArgumentException(f[i].getName() + " exceeds max length");
						}
					}
				} catch(Exception e) {
					System.out.println(e);
				}
			}
		}
	}
}

public class MaxLengthTest {

	public static void main(String[] args) {

		try {
			User u1 = new User("Dipanshu");
			System.out.println("User created: " + u1.username);
			User u2 = new User("DipanshuSharma123");
			System.out.println("User created: " + u2.username);
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
