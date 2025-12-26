import java.util.Scanner;

public class CheckIfCollinearPoints{
	public static boolean checkCollinearSlope(int x1,int y1,int x2,int y2,int x3,int y3){
		int dx1=x2-x1;
		int dy1=y2-y1;
		int dx2=x3-x2;
		int dy2=y3-y2;
		int dx3=x3-x1;
		int dy3=y3-y1;
		if(dy1*dx2==dy2*dx1 && dy2*dx3==dy3*dx2){
			return true;
		}
		return false;
	}
	public static boolean checkCollinearArea(int x1,int y1,int x2,int y2,int x3,int y3){
		int area=(x1*(y2-y3) + x2*(y3-y1) + x3*(y1-y2));
		if(area==0){
			return true;
		}
		return false;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter coordinates of point A (x1 y1):");
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		System.out.println("Enter coordinates of point B (x2 y2):");
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		System.out.println("Enter coordinates of point C (x3 y3):");
		int x3=sc.nextInt();
		int y3=sc.nextInt();
		boolean collinearSlope=checkCollinearSlope(x1,y1,x2,y2,x3,y3);
		boolean collinearArea=checkCollinearArea(x1,y1,x2,y2,x3,y3);
		System.out.println("Collinear by Slope method: "+collinearSlope);
		System.out.println("Collinear by Area method: "+collinearArea);
		sc.close();
	}
}
