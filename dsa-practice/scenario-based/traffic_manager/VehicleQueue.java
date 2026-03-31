package traffic_manager;

import java.util.LinkedList;
import java.util.Queue;

public class VehicleQueue {
	Queue<Integer> q = new LinkedList<>();
	int capacity;

	VehicleQueue(int capacity){
		this.capacity = capacity;
	}

	public void add(int id){
		if(q.size() == capacity){
			System.out.println("Queue Overflow");
			return;
		}
		q.add(id);
	}

	public int remove(){
		if(q.isEmpty()){
			System.out.println("Queue Underflow");
			return -1;
		}
		return q.remove();
	}
}
