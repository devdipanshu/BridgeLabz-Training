import java.util.Scanner;

public class MultiDimensionalToSingleDimensional {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int rows = sc.nextInt();
		
		System.out.println("Enter the number of column: ");
		int columns = sc.nextInt();
		
		int[][]matrix = new int[rows][columns];
		
		for(int i = 0;i<rows;i++) {
			for(int j = 0;j<columns;j++) {
				System.out.println("Enter the value for row "+i+" and column "+j+": ");
				matrix[i][j] = sc.nextInt();
			}
		}
		
		int[]array = new int[rows*columns];
		int index = 0;
		
		for(int i = 0;i<rows;i++) {
			for(int j = 0;j<columns;j++) {
				array[index] = matrix[i][j];
				index++;
			}
		}
		
		for(int i = 0;i<array.length;i++) {
			System.out.println("The Value on index "+i+" is: "+array[i]);
		}
		sc.close();
		
	}
}
