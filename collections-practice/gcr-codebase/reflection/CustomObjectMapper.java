import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

class Student1 {

	int id;
	String name;
}

class ObjectMapper {

	static Object toObject(Class clazz, Map<String,Object> properties) {
		Object obj = null;
		try {
			obj = clazz.getDeclaredConstructor().newInstance();
			Field[] fields = clazz.getDeclaredFields();
			for(int i = 0;i<fields.length;i++) {
				fields[i].setAccessible(true);
				if(properties.containsKey(fields[i].getName())) {
					fields[i].set(obj,properties.get(fields[i].getName()));
				}
			}
		} catch(Exception e) {
			System.out.println(e);
		}
		return obj;
	}
}
public class CustomObjectMapper {
	public static void main(String[] args) {
		Map<String,Object> data = new HashMap<String,Object>();
		data.put("id",101);
		data.put("name","Dipanshu");
		Student1 s = (Student1)ObjectMapper.toObject(Student1.class,data);
		System.out.println(s.id);
		System.out.println(s.name);
	}
}
