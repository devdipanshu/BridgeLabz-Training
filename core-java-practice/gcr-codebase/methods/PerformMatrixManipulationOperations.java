import java.util.Scanner;

public class PerformMatrixManipulationOperations{
	public static int[][] createRandomMatrix(int rows,int cols){
		int[][] matrix=new int[rows][cols];
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				matrix[i][j]=(int)(Math.random()*10);
			}
		}
		return matrix;
	}
	public static int[][] addMatrices(int[][] a,int[][] b){
		int rows=a.length;
		int cols=a[0].length;
		int[][] sum=new int[rows][cols];
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				sum[i][j]=a[i][j]+b[i][j];
			}
		}
		return sum;
	}
	public static int[][] subtractMatrices(int[][] a,int[][] b){
		int rows=a.length;
		int cols=a[0].length;
		int[][] diff=new int[rows][cols];
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				diff[i][j]=a[i][j]-b[i][j];
			}
		}
		return diff;
	}
	public static int[][] multiplyMatrices(int[][] a,int[][] b){
		int rows=a.length;
		int cols=b[0].length;
		int common=a[0].length;
		int[][] product=new int[rows][cols];
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				int sum=0;
				for(int k=0;k<common;k++){
					sum+=a[i][k]*b[k][j];
				}
				product[i][j]=sum;
			}
		}
		return product;
	}
	public static void displayMatrix(int[][] matrix){
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		int rows=sc.nextInt();
		System.out.print("Enter the number of columns: ");
		int cols=sc.nextInt();
		int[][] matrixA=createRandomMatrix(rows,cols);
		int[][] matrixB=createRandomMatrix(rows,cols);
		System.out.println("Matrix A is:");
		displayMatrix(matrixA);
		System.out.println("Matrix B is:");
		displayMatrix(matrixB);
		int[][] sum=addMatrices(matrixA,matrixB);
		System.out.println("Addition of matrices is:");
		displayMatrix(sum);
		int[][] diff=subtractMatrices(matrixA,matrixB);
		System.out.println("Subtraction of matrices:");
		displayMatrix(diff);
		if(matrixA[0].length==matrixB.length){
			int[][] product=multiplyMatrices(matrixA,matrixB);
			System.out.println("Multiplication of matrices is:");
			displayMatrix(product);
		} else {
			System.out.println("Matrices cannot be multiplied with each other because of dimension");
		}
		sc.close();
	}
}
