class TextNode{
	String text;
	TextNode prev;
	TextNode next;

	TextNode(String text){
		this.text = text;
	}
}

public class TextEditorUndoRedo {

	static TextNode head = null;
	static TextNode tail = null;
	static TextNode current = null;
	static int size = 0;
	static int limit = 10;

	public void addState(String text){
		TextNode node = new TextNode(text);

		if(head == null){
			head = node;
			tail = node;
			current = node;
			size = 1;
		}
		else{
			if(current != tail){
				current.next.prev = null;
				current.next = null;
				tail = current;
				size = count();
			}

			tail.next = node;
			node.prev = tail;
			tail = node;
			current = node;
			size++;

			if(size > limit){
				head = head.next;
				head.prev = null;
				size--;
			}
		}
	}

	public void undo(){
		if(current != null && current.prev != null){
			current = current.prev;
		}
	}

	public void redo(){
		if(current != null && current.next != null){
			current = current.next;
		}
	}

	public void displayCurrent(){
		if(current != null){
			System.out.println(current.text);
		}
	}

	public int count(){
		int c = 0;
		TextNode temp = head;
		while(temp != null){
			c++;
			temp = temp.next;
		}
		return c;
	}
	public static void main(String[] args) {

		TextEditorUndoRedo obj = new TextEditorUndoRedo();
		obj.addState("Hello");
		obj.addState("Hello World");
		obj.addState("Hello World Java");
		obj.displayCurrent();
		obj.undo();
		obj.displayCurrent();
		obj.undo();
		obj.displayCurrent();
		obj.redo();
		obj.displayCurrent();
	}
}
