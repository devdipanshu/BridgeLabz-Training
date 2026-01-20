package traffic_manager;

public class CircularLinkedList {
	Vehicle head;

	public void add(int id){
		Vehicle v = new Vehicle(id);
		if(head == null){
			head = v;
			v.next = head;
			return;
		}
		Vehicle temp = head;
		while(temp.next != head){
			temp = temp.next;
		}
		temp.next = v;
		v.next = head;
	}

	public void remove(){
		if(head == null){
			return;
		}
		if(head.next == head){
			head = null;
			return;
		}
		Vehicle temp = head;
		while(temp.next.next != head){
			temp = temp.next;
		}
		temp.next = head;
	}

	public void print(){
		if(head == null){
			System.out.println("Roundabout Empty");
			return;
		}
		Vehicle temp = head;
		do{
			System.out.print(temp.id+" ");
			temp = temp.next;
		}while(temp != head);
		System.out.println();
	}
}
