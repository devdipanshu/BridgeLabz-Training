import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
class Student {
	int id;
	String name;
	int age;
	int marks;
	Student(int id,String name,int age,int marks) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
	void display() {
		System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Marks: " + marks);
	}
}
public class CSVtoObjects {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		try {
			BufferedReader br = new BufferedReader(new FileReader("D:\\BridgeLabz-Training\\gcr-codebase\\csvdatahandling\\students.txt"));
			String line = br.readLine();
			while((line=br.readLine())!=null) {
				String[] data = line.split(",");
				int id = Integer.parseInt(data[0]);
				String name = data[1];
				int age = Integer.parseInt(data[2]);
				int marks = Integer.parseInt(data[3]);
				students.add(new Student(id,name,age,marks));
			}
			br.close();
			for(int i=0;i<students.size();i++) {
				students.get(i).display();
			}
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}
