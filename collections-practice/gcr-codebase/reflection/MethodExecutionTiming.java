import java.lang.reflect.Method;

class Sample {
	void taskOne() {
		for(int i=0;i<4000000;i++);
	}
	void taskTwo() {
		for(int i=0;i<900000;i++);
	}
}
public class MethodExecutionTiming {
	public static void main(String[] args) {
		try {
			Sample s = new Sample();
			Class c = s.getClass();
			Method[] m = c.getDeclaredMethods();
			for(int i=0;i<m.length;i++) {
				long start = System.nanoTime();
				m[i].invoke(s);
				long end = System.nanoTime();
				System.out.println(m[i].getName()+" executed in "+(end-start)+" ns");
			}
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
