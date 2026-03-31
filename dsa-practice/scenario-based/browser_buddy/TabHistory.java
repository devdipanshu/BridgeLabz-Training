package browser_buddy;

public class TabHistory {
	HistoryNode current;

	public void visit(String url){
		HistoryNode node = new HistoryNode(url);
		if(current == null){
			current = node;
			return;
		}
		node.prev = current;
		current.next = node;
		current = node;
	}

	public void back(){
		if(current != null && current.prev != null){
			current = current.prev;
		}
	}

	public void forward(){
		if(current != null && current.next != null){
			current = current.next;
		}
	}

	public String getCurrent(){
		if(current == null){
			return "No Page";
		}
		return current.url;
	}
}
