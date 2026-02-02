import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Todo {
	String task();
	String assignedTo();
	String priority() default "MEDIUM";
}
class Project {

	@Todo(task="Implement login", assignedTo="Dipanshu")
	void loginFeature() {
	}
	@Todo(task="Add payment gateway", assignedTo="Sweta", priority="HIGH")
	void paymentFeature() {
	}
	void completedFeature() {
	}
}
public class TodoAnnotationTest {
	public static void main(String[] args) {
		Project p = new Project();
		Class c = p.getClass();
		Method[] m = c.getDeclaredMethods();
		for(int i=0;i<m.length;i++) {
			if(m[i].isAnnotationPresent(Todo.class)) {
				Todo t = (Todo)m[i].getAnnotation(Todo.class);
				System.out.println("Method : " + m[i].getName());
				System.out.println("Task : " + t.task());
				System.out.println("Assigned To : " + t.assignedTo());
				System.out.println("Priority : " + t.priority());
				System.out.println("-------------------------");
			}
		}
	}
}
