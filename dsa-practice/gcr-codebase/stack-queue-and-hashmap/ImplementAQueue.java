class StackNode{
	StackNode next;
	int data;
	StackNode(int data){
		this.data = data;
		this.next = null;
	}
}
class Stack{
	StackNode top;
	public void push(int val) {
		StackNode node = new StackNode(val);
		if(top == null) {
			top = node;
		}
		else {
			node.next = top;
			top = node;
		}
	}
	public int pop() {
		
		if(top!=null) {
			StackNode res = top;
			top = top.next;
			return res.data;
		}
		return -1;
		
	}
}
class Queue{
	Stack s1 = new Stack();
	Stack s2 = new Stack();
	public void enque(int val) {
		while(s1.top!=null) {
			s2.push(s1.pop());
		}
		s1.push(val);
		while(s2.top!=null) {
			s1.push(s2.pop());
		}
	}
	public void deque() {
		if(s1.top == null) {
			System.out.println("Queue is empty");
			return;
		}
		s1.pop();
	}
	public void display() {
		StackNode temp = s1.top;
		while(temp!=null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
}
public class ImplementAQueue {
	public static void main(String[] args) {
		Queue q = new Queue();
		q.enque(10);
		q.enque(20);
		q.enque(30);
		q.display();
		System.out.println();
		q.deque();
		q.display();
	}
}
