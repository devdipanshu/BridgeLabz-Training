package parcel_tracker;

public class DeliveryChain {
	ParcelStage head;

	public void addStage(String stage){
		ParcelStage node = new ParcelStage(stage);
		if(head == null){
			head = node;
			return;
		}
		ParcelStage temp = head;
		while(temp.next != null){
			temp = temp.next;
		}
		temp.next = node;
	}

	public void addAfter(String target,String newStage){
		ParcelStage temp = head;
		while(temp != null){
			if(temp.stage.equals(target)){
				ParcelStage node = new ParcelStage(newStage);
				node.next = temp.next;
				temp.next = node;
				return;
			}
			temp = temp.next;
		}
	}

	public void track(){
		if(head == null){
			System.out.println("Parcel Lost");
			return;
		}
		ParcelStage temp = head;
		while(temp != null){
			System.out.print(temp.stage);
			if(temp.next != null){
				System.out.print(" -> ");
			}
			temp = temp.next;
		}
		System.out.println();
	}
}
