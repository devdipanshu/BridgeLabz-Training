package parcel_tracker;

public class Main {
	public static void main(String[] args){

		ParcelTracker pt = new ParcelTracker();

		pt.initialize();
		pt.showStatus();

		pt.addCheckpoint("Shipped","Custom Checkpoint");
		pt.showStatus();

		ParcelTracker lost = new ParcelTracker();
		lost.showStatus();
	}
}
