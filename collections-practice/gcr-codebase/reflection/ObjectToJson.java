import java.lang.reflect.Field;
class Student2 {
	int id;
	String name;
	int age;
	Student2(int id,String name,int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
}
class JsonGenerator {
	static String toJson(Object obj) {
		String json = "{";
		Class c = obj.getClass();
		Field[] fields = c.getDeclaredFields();
		for(int i = 0;i<fields.length;i++) {
			fields[i].setAccessible(true);
			try {
				json = json + "\"" + fields[i].getName() + "\":";
				Object value = fields[i].get(obj);
				if(value instanceof String) {
					json = json + "\"" + value + "\"";
				} else {
					json = json + value;
				}
				if(i < fields.length - 1) {
					json = json + ", ";
				}
			} catch(Exception e) {
				System.out.println(e);
			}
		}
		json = json + "}";
		return json;
	}
}
public class ObjectToJson {
	public static void main(String[] args) {
		Student2 s = new Student2(101,"Dipanshu",22);
		String json = JsonGenerator.toJson(s);
		System.out.println(json);
	}
}
