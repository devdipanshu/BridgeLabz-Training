import java.util.Scanner;

public class VolumeOfCylinder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double radius = sc.nextDouble();
		double height = sc.nextDouble();
		double area = Math.PI*radius*radius*height;
		System.out.println(area);

	}

}
