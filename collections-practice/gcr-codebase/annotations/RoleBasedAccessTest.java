import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface RoleAllowed {
	String value();
}
class AdminOperations {
	@RoleAllowed("ADMIN")
	void deleteUser() {
		System.out.println("User deleted");
	}
	void viewDashboard() {
		System.out.println("Dashboard viewed");
	}
}
public class RoleBasedAccessTest {

	public static void main(String[] args) {

		String currentUserRole = "USER";

		AdminOperations ao = new AdminOperations();
		Class c = ao.getClass();
		Method[] m = c.getDeclaredMethods();

		for(int i=0;i<m.length;i++) {
			if(m[i].isAnnotationPresent(RoleAllowed.class)) {
				RoleAllowed r = (RoleAllowed)m[i].getAnnotation(RoleAllowed.class);
				if(r.value().equals(currentUserRole)) {
					try {
						m[i].invoke(ao);
					} catch(Exception e) {
						System.out.println(e);
					}
				} else {
					System.out.println("Access Denied!");
				}
			} else {
				try {
					m[i].invoke(ao);
				} catch(Exception e) {
					System.out.println(e);
				}
			}
		}
	}
}
