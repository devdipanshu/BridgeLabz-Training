import java.util.Scanner;

public class PerformMatrixManipulationOperation2{
	public static int[][] createRandomMatrix(int rows,int cols){
		int[][] matrix=new int[rows][cols];
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				matrix[i][j]=(int)(Math.random()*10);
			}
		}
		return matrix;
	}
	public static int[][] transposeMatrix(int[][] matrix){
		int rows=matrix.length;
		int cols=matrix[0].length;
		int[][] transpose=new int[cols][rows];
		for(int i=0;i<rows;i++){
			for(int j=0;j<cols;j++){
				transpose[j][i]=matrix[i][j];
			}
		}
		return transpose;
	}
	public static int determinant2x2(int[][] matrix){
		return matrix[0][0]*matrix[1][1]-matrix[0][1]*matrix[1][0];
	}
	public static int determinant3x3(int[][] matrix){
		int det=matrix[0][0]*(matrix[1][1]*matrix[2][2]-matrix[1][2]*matrix[2][1])
				-matrix[0][1]*(matrix[1][0]*matrix[2][2]-matrix[1][2]*matrix[2][0])
				+matrix[0][2]*(matrix[1][0]*matrix[2][1]-matrix[1][1]*matrix[2][0]);
		return det;
	}
	public static double[][] inverse2x2(int[][] matrix){
		double det=determinant2x2(matrix);
		if(det==0){
			return null;
		}
		double[][] inv=new double[2][2];
		inv[0][0]=matrix[1][1]/det;
		inv[0][1]=-matrix[0][1]/det;
		inv[1][0]=-matrix[1][0]/det;
		inv[1][1]=matrix[0][0]/det;
		return inv;
	}
	public static double[][] inverse3x3(int[][] matrix){
		int det=determinant3x3(matrix);
		if(det==0){
			return null;
		}
		double[][] inv=new double[3][3];
		inv[0][0]=(matrix[1][1]*matrix[2][2]-matrix[1][2]*matrix[2][1])/ (double)det;
		inv[0][1]=-(matrix[0][1]*matrix[2][2]-matrix[0][2]*matrix[2][1])/ (double)det;
		inv[0][2]=(matrix[0][1]*matrix[1][2]-matrix[0][2]*matrix[1][1])/ (double)det;
		inv[1][0]=-(matrix[1][0]*matrix[2][2]-matrix[1][2]*matrix[2][0])/ (double)det;
		inv[1][1]=(matrix[0][0]*matrix[2][2]-matrix[0][2]*matrix[2][0])/ (double)det;
		inv[1][2]=-(matrix[0][0]*matrix[1][2]-matrix[0][2]*matrix[1][0])/ (double)det;
		inv[2][0]=(matrix[1][0]*matrix[2][1]-matrix[1][1]*matrix[2][0])/ (double)det;
		inv[2][1]=-(matrix[0][0]*matrix[2][1]-matrix[0][1]*matrix[2][0])/ (double)det;
		inv[2][2]=(matrix[0][0]*matrix[1][1]-matrix[0][1]*matrix[1][0])/ (double)det;
		return inv;
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
	public static void displayMatrix(double[][] matrix){
		if(matrix==null){
			System.out.println("Inverse does not exist for this matrix");
			return;
		}
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[0].length;j++){
				System.out.printf("%.2f ",matrix[i][j]);
			}
			System.out.println();
		}
		System.out.println();
	}
	public static void main(String[] args){
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter matrix size (either 2 or 3): ");
		int size=sc.nextInt();
		int[][] matrix=createRandomMatrix(size,size);
		System.out.println("Original Matrix is:");
		displayMatrix(matrix);
		int[][] transpose=transposeMatrix(matrix);
		System.out.println("Transpose Matrix is:");
		displayMatrix(transpose);
		
		if(size==2){
			int det2=determinant2x2(matrix);
			System.out.println("Determinant of the matrix is: "+det2);
			double[][] inv2=inverse2x2(matrix);
			System.out.println("Inverse Matrix:");
			displayMatrix(inv2);
		}
		else if(size==3){
			int det3=determinant3x3(matrix);
			System.out.println("Determinant of the matrix is: "+det3);
			double[][] inv3=inverse3x3(matrix);
			System.out.println("Inverse Matrix is:");
			displayMatrix(inv3);
		}
		else{
			System.out.println("Matrix size not supported");
		}

		sc.close();
	}
}
