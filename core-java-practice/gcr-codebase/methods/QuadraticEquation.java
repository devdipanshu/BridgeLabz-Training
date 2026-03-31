import java.util.Scanner;

public class QuadraticEquation {

	public static double[] findRoots(int a, int b, int c) {
		double delta = Math.pow(b,2) - (4 * a * c);
		if(delta > 0) {
			double root1 = (-b + Math.sqrt(delta))/(2 * a);
			double root2 = (-b - Math.sqrt(delta))/(2 * a);
			double[] roots = new double[2];
			roots[0] = root1;
			roots[1] = root2;
			return roots;
		}
		else if(delta == 0) {
			double root = -b/(2.0 * a);
			double[] roots = new double[1];
			roots[0] = root;
			return roots;
		}
		else {
			return new double[0];
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		double[] roots = findRoots(a,b,c);
		if(roots.length == 2) {
			System.out.println("Root 1 is: "+roots[0]);
			System.out.println("Root 2 is: "+roots[1]);
		}
		else if(roots.length == 1) {
			System.out.println("Only one root is: "+roots[0]);
		}
		else {
			System.out.println("No real roots");
		}
		sc.close();
	}
}
