package traffic_manager;

public class Main {
	public static void main(String[] args){

		TrafficManager tm = new TrafficManager(3);

		tm.vehicleArrives(101);
		tm.vehicleArrives(102);
		tm.vehicleArrives(103);
		tm.vehicleArrives(104);

		tm.allowEntry();
		tm.allowEntry();

		tm.showState();

		tm.vehicleExit();
		tm.showState();
	}
}
