import java.util.Scanner;

public class DistanceInYardsAndMiles {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double distanceInFeets = sc.nextDouble();
		double distanceInYards = distanceInFeets/3;
		double distanceInMiles = distanceInYards/1760;
		System.out.println("The distance in Feets is "+distanceInFeets+", Yards is "+distanceInYards
				+", Miles is "+distanceInMiles);
	}

}
