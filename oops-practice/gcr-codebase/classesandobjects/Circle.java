public class Circle {
	double radius;
	double area;
	double circumference;
	Circle(double radius){
		this.radius = radius;
	}
	
	public void calculateArea() {
		 this.area = Math.PI*(this.radius)*(this.radius);
	}
	
	public void calculateCircumference() {
		this.circumference = Math.PI*2*this.radius;
	}
	public void displayArea() {
		System.out.println("Area of circle: "+this.area);
	}
	public void displayCircumference() {
		System.out.println("Circumference of circle: "+this.circumference);
	}
	public static void main(String[] args) {
		Circle circle = new Circle(10);
		circle.calculateArea();
		circle.calculateCircumference();
		circle.displayArea();
		circle.displayCircumference();
	}
}
