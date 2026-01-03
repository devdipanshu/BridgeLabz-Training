class Animal{
	String name;
	int age;
	Animal(String name,int age){
		this.name = name;
		this.age = age;
	}
	void makeSound() {
		System.out.println("Animals Make Sounds");
	}
}
class Dog extends Animal{
	Dog(String name,int age){
		super(name,age);
	}
	void makeSound() {
		System.out.println("Dog Barks");
	}
}
class Cat extends Animal{
	Cat(String name,int age){
		super(name,age);
	}
	void makeSound() {
		System.out.println("Cat Meows");
	}
}
class Bird extends Animal{
	Bird(String name,int age){
		super(name,age);
	}
	void makeSound() {
		System.out.println("Bird Whistles");
	}
}
public class AnimalHierarchy {
	public static void main(String[] args) {
		Dog dog = new Dog("Sheru",9);
		Cat cat = new Cat("kitty",6);
		Bird bird = new Bird("chitti",3);
		dog.makeSound();
		cat.makeSound();
		bird.makeSound();
	}
}
