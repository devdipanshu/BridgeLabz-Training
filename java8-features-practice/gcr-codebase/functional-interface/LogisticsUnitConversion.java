
interface UnitConverter{
	static double kmToMiles(double km){
		return km*0.621371;
	}
	static double kgToLbs(double kg){
		return kg*2.20462;
	}
}
public class LogisticsUnitConversion{
	public static void main(String[] args){
		double[] kms={10,25,50};
		double[] kgs={5,12,20};
		for(int i=0;i<kms.length;i++){
			System.out.println(UnitConverter.kmToMiles(kms[i]));
		}
		for(int i=0;i<kgs.length;i++){
			System.out.println(UnitConverter.kgToLbs(kgs[i]));
		}
	}
}
