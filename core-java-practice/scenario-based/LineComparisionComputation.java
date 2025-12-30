import java.util.Scanner;

public class LineComparisionComputation {
	
	//Use Case 1: Model A Line based on a point consisting of (x,y) co-ordinates using the Cartesian system to calculate its length
	public static double computeLength(double x1,double y1,double x2,double y2) {
		
		double lengthOfLine = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		lengthOfLine = (Math.round(lengthOfLine*100))/100.0;
		return lengthOfLine;
	}
	
	//Use Case 2: Check the equality of two lines
	public static boolean checkEquality(Double length1,Double length2) {
		return length1.equals(length2);
	}
	
	//Use Case 3: Compare two lines to know if it is equal/which one is greater/which one is smaller
	public static int compareLines(Double length1, Double lenght2) {
		int result = length1.compareTo(lenght2);
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Line Comparision Computation Program");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the co-ordinates for the line 1: ");
		System.out.println();
		System.out.println("Enter the value of x1: ");
		double x1 = sc.nextDouble();
		System.out.println("Enter the value of x2: ");
		double x2 = sc.nextDouble();
		System.out.println("Enter the value of y1: ");
		double y1 = sc.nextDouble();
		System.out.println("Enter the value of y2: ");
		double y2 = sc.nextDouble();
		
		double length1 = computeLength(x1,y1,x2,y2);
		
		System.out.println("Enter the co-ordinates for the line 2: ");
		System.out.println();
		System.out.println("Enter the value of x3: ");
		double x3 = sc.nextDouble();
		System.out.println("Enter the value of x4: ");
		double x4 = sc.nextDouble();
		System.out.println("Enter the value of y3: ");
		double y3 = sc.nextDouble();
		System.out.println("Enter the value of y4: ");
		double y4 = sc.nextDouble();
		
		double length2 = computeLength(x3,y3,x4,y4);
		
		System.out.println("Length of Line 1 is: "+length1);
		System.out.println();
		System.out.println("Length of Line 2 is: "+length2);
		System.out.println();
		boolean isEqual = checkEquality(length1,length2);
		if(isEqual) {
			System.out.println("Both The Lines are equal");
		}
		else {
			System.out.println("Both The Lines are not equal");
		}
		System.out.println();
		int result = compareLines(length1,length2);
		if(result == 0) {
			System.out.println("Result is Zero, Both the lines are equal");
		}
		else if(result>0) {
			System.out.println("Line 1 is greater than Line 2");
		}
		else {
			System.out.println("Line 2 is greater than Line 1");
		}
		sc.close();
	}
}
