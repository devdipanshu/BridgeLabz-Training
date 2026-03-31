import java.util.Scanner;

public class TemperatureAnalyzer {
	
	public static float[] averageTemp(float[][] temp) {
		float[] avgTemp = new float[7];
		for(int i = 0;i<temp.length;i++) {
			float sum = 0;
			for(int j = 0;j<temp[i].length;j++) {
				sum+=temp[i][j];
			}
			avgTemp[i] = (sum/24);
		}
		return avgTemp;
	}
	public static int[] hottestAndColdestDay(float[] avgTemp) {
		int lowestTempIdx = 0;
		int highestTempIdx = 0;
		for(int i = 1;i<avgTemp.length;i++) {
			if(avgTemp[lowestTempIdx]>avgTemp[i]) {
				lowestTempIdx = i;
			}
			if(avgTemp[highestTempIdx]<avgTemp[i]) {
				highestTempIdx = i;
			}
		}
		int[] lowestAndHighestIdx = {lowestTempIdx,highestTempIdx};
		return lowestAndHighestIdx;
	}
	public static void displayAverageTemperature(float[] avgTemp,String[]days) {
		for(int i = 0;i<avgTemp.length;i++) {
			System.out.println("Average Temperature on "+days[i]+" is "+avgTemp[i]);
		}
	}
	public static void displayHottestAndColdestDay(int[]hotAndCold,String[]days) {
		System.out.println("Coldest Day is: "+days[hotAndCold[0]]);
		System.out.println("Hottest Day is: "+days[hotAndCold[1]]);
	}
	public static void main(String[] args) {
		float[][] temperature = new float[7][24];
		String[] days = new String[] {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
		
		String[]hours = new String[] {"00:00AM","01:00AM","02:00AM","03:00AM",
				                      "04:00AM","05:00AM","06:00AM","07:00AM",
				                      "08:00AM","09:00AM","10:00AM","11:00AM",
				                      "12:00PM","01:00PM","02:00PM","03:00PM",
				                      "04:00PM","05:00PM","06:00PM","07:00PM",
				                      "08:00PM","09:00PM","10:00PM","11:00PM",
				                      };
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i<days.length;i++) {
			for(int j = 0;j<hours.length;j++) {
				System.out.println("Enter the temperature of "+days[i]+" at "+hours[j]);
				temperature[i][j] = sc.nextFloat();
			}
		}
		
		float[]avgTemp = averageTemp(temperature);
		int[]hotAndCold = hottestAndColdestDay(avgTemp);
		displayAverageTemperature(avgTemp,days);
		displayHottestAndColdestDay(hotAndCold,days);
		sc.close();
	}
}
