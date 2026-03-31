import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ClassInformation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter class name : ");
		String className = sc.nextLine();
		try {
			Class c = Class.forName(className);
			System.out.println("---- Methods ----");
			Method[] methods = c.getDeclaredMethods();
			for(int i = 0;i<methods.length;i++) {
				System.out.println(methods[i].getName());
			}
			System.out.println("---- Fields ----");
			Field[] fields = c.getDeclaredFields();
			for(int i = 0;i<fields.length;i++) {
				System.out.println(fields[i].getName());
			}
			System.out.println("---- Constructors ----");
			Constructor[] constructors = c.getDeclaredConstructors();
			for(int i = 0;i<constructors.length;i++) {
				System.out.println(constructors[i].getName());
			}
		} catch(ClassNotFoundException e) {
			System.out.println("Class not found");
		}
	}
}
