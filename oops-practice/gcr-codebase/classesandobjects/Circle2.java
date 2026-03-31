import java.util.Scanner;

public class Circle2 {
	double radius;	
	Circle2(){
		this(20.5);
		System.out.println("Default Constructor Called");
		
	}
	Circle2(double radius){
		this.radius = radius;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();
		Circle2 circle1 = new Circle2();
		Circle2 circle2 = new Circle2(radius);
		System.out.println("radius with constructor chaining: "+circle1.radius);
		System.out.println("radius by user provided value: "+circle2.radius);
		sc.close();
	}
}
