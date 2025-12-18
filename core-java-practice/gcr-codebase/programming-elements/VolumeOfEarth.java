
public class VolumeOfEarth {
	public static void main(String[]args) {
		double radiusOfEarthInKm = 6378;
		double radiusOfEarthInMiles = (radiusOfEarthInKm/1.6);
		double volumeOfSphereInKm = (4/3)*Math.PI*radiusOfEarthInKm*radiusOfEarthInKm*radiusOfEarthInKm;
		double volumeOfSphereInMiles = (4/3)*Math.PI*radiusOfEarthInMiles*radiusOfEarthInMiles*radiusOfEarthInMiles;
		System.out.println("The volume of earth in cubic kilometers is "+volumeOfSphereInKm+" and cubic miles is "+
				volumeOfSphereInMiles);
	}
}
