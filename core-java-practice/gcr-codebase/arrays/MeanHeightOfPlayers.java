import java.util.Scanner;

public class MeanHeightOfPlayers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double [] height = new double[11];
		for(int i = 0;i<height.length;i++) {
			height[i] = sc.nextDouble();
		}
		
		double sum = 0;
		for(int i = 0;i<height.length;i++) {
			sum = sum+height[i];
		}
		
		double meanHeight = sum/11;
		System.out.println("mean height of the players is: "+meanHeight);
		sc.close();
	}
}
