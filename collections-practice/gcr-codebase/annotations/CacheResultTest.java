import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Method;
import java.util.HashMap;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CacheResult {
}
class Calculator {
	@CacheResult
	int fibonacci(int n) {
		if(n<=1) return n;
		return fibonacci(n-1)+fibonacci(n-2);
	}
}
public class CacheResultTest {
	static HashMap<String,Object> cache = new HashMap<>();
	public static void main(String[] args) {
		try {
			Calculator c = new Calculator();
			Class cl = c.getClass();
			Method m = cl.getDeclaredMethod("fibonacci",int.class);

			for(int i=0;i<=10;i++) {
				String key = m.getName() + ":" + i;
				if(cache.containsKey(key)) {
					System.out.println("fib(" + i + ") = " + cache.get(key) + " [from cache]");
				} else {
					Object result = m.invoke(c,i);
					cache.put(key,result);
					System.out.println("fib(" + i + ") = " + result);
				}
			}
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
