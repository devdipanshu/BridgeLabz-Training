import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Field;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface JsonField {
	String name();
}

class User1 {
	@JsonField(name="user_name")
	String username;

	@JsonField(name="user_age")
	int age;

	User1(String username,int age) {
		this.username = username;
		this.age = age;
	}
}

public class JsonFieldTest {

	static String toJson(Object obj) {
		String json = "{";
		Class c = obj.getClass();
		Field[] f = c.getDeclaredFields();
		for(int i=0;i<f.length;i++) {
			if(f[i].isAnnotationPresent(JsonField.class)) {
				JsonField jf = (JsonField)f[i].getAnnotation(JsonField.class);
				try {
					f[i].setAccessible(true);
					Object val = f[i].get(obj);
					json = json + "\"" + jf.name() + "\":";
					if(val instanceof String) {
						json = json + "\"" + val + "\"";
					} else {
						json = json + val;
					}
					if(i<f.length-1) json = json + ", ";
				} catch(Exception e) {
					System.out.println(e);
				}
			}
		}
		json = json + "}";
		return json;
	}

	public static void main(String[] args) {
		User1 u = new User1("Dipanshu",22);
		String json = toJson(u);
		System.out.println(json);
	}
}

