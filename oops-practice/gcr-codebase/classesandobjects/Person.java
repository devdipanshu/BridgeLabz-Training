public class Person {
	String name;
	int age;
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	Person(Person person){
		this.name = person.name;
		this.age = person.age;
	}
	
	public static void main(String[] args) {
		Person person1 = new Person("Rahul",21);
		Person person2 = new Person(person1);
		
		System.out.println("Original Details: ");
		System.out.println("Name: "+person1.name);
		System.out.println("Age: "+person1.age);
		System.out.println();
		System.out.println("Copied Details: ");
		System.out.println("Name: "+person2.name);
		System.out.println("Age: "+person2.age);
	}
}
