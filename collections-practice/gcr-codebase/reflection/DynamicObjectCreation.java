class Student {
	Student() {
		System.out.println("Student object created");
	}
}
public class DynamicObjectCreation {
	public static void main(String[] args) {
		try {
			Class c = Class.forName("reflection.Student");
			Object obj = c.getDeclaredConstructor().newInstance();
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
