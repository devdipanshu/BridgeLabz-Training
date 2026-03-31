import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface LogExecutionTime {
}
class Operations {
	@LogExecutionTime
	void taskOne() {
		for(int i=0;i<1000000;i++);
	}
	@LogExecutionTime
	void taskTwo() {
		for(int i=0;i<500000;i++);
	}
	void normalTask() {
		for(int i=0;i<100000;i++);
	}
}
public class LogExecutionTimeTest {
	public static void main(String[] args) {
		Operations op = new Operations();
		Class c = op.getClass();
		Method[] m = c.getDeclaredMethods();
		for(int i=0;i<m.length;i++) {
			if(m[i].isAnnotationPresent(LogExecutionTime.class)) {
				try {
					long start = System.nanoTime();
					m[i].invoke(op);
					long end = System.nanoTime();
					System.out.println(m[i].getName() + " executed in " + (end-start) + " ns");
				} catch(Exception e) {
					System.out.println(e);
				}
			}
		}
	}
}
