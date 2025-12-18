import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		double height = sc.nextDouble();
		double base = sc.nextDouble();
		double areaInCM = 0.5*base*height;
		double areaInInches = areaInCM/2.54;
		System.out.println("Height of trianle is "+height+", Base is "+base+", the area in CM is "+areaInCM+""
				+ ", and the area in Inches is "+areaInInches);
	}
}
