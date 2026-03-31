import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface ImportantMethod {
	String level() default "HIGH";
}
class ImportantService {
	@ImportantMethod
	void saveData() {
	}
	@ImportantMethod(level="LOW")
	void loadData() {
	}
}
public class ImportantMethodTest {
	public static void main(String[] args) {
		ImportantService s = new ImportantService();
		Class c = s.getClass();
		Method[] m = c.getDeclaredMethods();
		for(int i=0;i<m.length;i++) {
			if(m[i].isAnnotationPresent(ImportantMethod.class)) {
				ImportantMethod im = (ImportantMethod)m[i].getAnnotation(ImportantMethod.class);
				System.out.println(m[i].getName() + " : " + im.level());
			}
		}
	}
}
