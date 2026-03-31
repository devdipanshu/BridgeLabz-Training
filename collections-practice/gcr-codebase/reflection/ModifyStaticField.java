import java.lang.reflect.Field;

class Configuration {
	private static String API_KEY = "Hello_World";
}
public class ModifyStaticField {
	public static void main(String[] args) {
		try {
			Class c = Configuration.class;
			Field f = c.getDeclaredField("API_KEY");
			f.setAccessible(true);
			f.set(null,"Hello_Dipanshu");
			String value = (String)f.get(null);
			System.out.println("API_KEY : " + value);
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
