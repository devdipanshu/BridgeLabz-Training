import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
interface Greeting {
	void sayHello();
}
class GreetingImpl implements Greeting {
	public void sayHello() {
		System.out.println("Hello Dipanshu");
	}
}
class LoggingHandler implements InvocationHandler {
	Object target;
	LoggingHandler(Object target) {
		this.target = target;
	}
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("Calling method : " + method.getName());
		return method.invoke(target,args);
	}
}
public class LoggingProxyDemo {
	public static void main(String[] args) {
		Greeting g = new GreetingImpl();
		Greeting proxy = (Greeting)Proxy.newProxyInstance(
				g.getClass().getClassLoader(),
				g.getClass().getInterfaces(),
				new LoggingHandler(g)
		);
		proxy.sayHello();
	}
}
