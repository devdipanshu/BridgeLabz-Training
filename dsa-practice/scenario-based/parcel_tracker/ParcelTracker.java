package parcel_tracker;

public class ParcelTracker {
	DeliveryChain chain = new DeliveryChain();

	public void initialize(){
		chain.addStage("Packed");
		chain.addStage("Shipped");
		chain.addStage("In Transit");
		chain.addStage("Delivered");
	}

	public void addCheckpoint(String after,String stage){
		chain.addAfter(after,stage);
	}

	public void showStatus(){
		chain.track();
	}
}
