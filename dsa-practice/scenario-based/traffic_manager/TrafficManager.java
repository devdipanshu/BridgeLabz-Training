package traffic_manager;

public class TrafficManager {
	CircularLinkedList roundabout = new CircularLinkedList();
	VehicleQueue queue;

	TrafficManager(int capacity){
		queue = new VehicleQueue(capacity);
	}

	public void vehicleArrives(int id){
		queue.add(id);
	}

	public void allowEntry(){
		int id = queue.remove();
		if(id != -1){
			roundabout.add(id);
		}
	}

	public void vehicleExit(){
		roundabout.remove();
	}

	public void showState(){
		roundabout.print();
	}
}
