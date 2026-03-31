import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;
@Retention(RetentionPolicy.RUNTIME)
@interface Inject {
}
class Engine {
	void start() {
		System.out.println("Engine started");
	}
}
class Car {
	@Inject
	Engine engine;
	void drive() {
		if(engine!=null) {
			engine.start();
			System.out.println("Car is driving");
		} else {
			System.out.println("No engine injected");
		}
	}
}
class DIContainer {
	static void initialize(Object obj) {
		Class c = obj.getClass();
		Field[] f = c.getDeclaredFields();
		for(int i=0;i<f.length;i++) {
			if(f[i].isAnnotationPresent(Inject.class)) {
				f[i].setAccessible(true);
				try {
					Object dep = f[i].getType().getDeclaredConstructor().newInstance();
					f[i].set(obj,dep);
				} catch(Exception e) {
					System.out.println(e);
				}
			}
		}
	}
}
public class ReflectionDI {
	public static void main(String[] args) {
		Car car = new Car();
		DIContainer.initialize(car);
		car.drive();
	}
}