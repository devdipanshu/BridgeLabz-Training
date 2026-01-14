class StackNode2{
	StackNode2 next;
	int data;
	StackNode2(int data){
		this.data = data;
		this.next = null;
	}
}
class Stack2{
	StackNode2 top;
	public void push(int val) {
		StackNode2 node = new StackNode2(val);
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
			StackNode2 res = top;
			top = top.next;
			return res.data;
		}
		return -1;
		
	}
	public StackNode2 sort(Stack2 st1,Stack2 st2) {
		if(st1.top == null) {
			while(st2.top!=null) {
				st1.push(st2.pop());
			}
			return st1.top;
		}
		int temp = st1.pop();
		while(st2.top!=null && temp<st2.top.data) {
			st1.push(st2.pop());
		}
		st2.push(temp);
		return sort(st1,st2);
	}
	public void display(StackNode2 top) {
		StackNode2 temp = top;
		while(temp!=null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
}
public class SortAStack {
	public static void main(String[] args) {
		Stack2 s1 = new Stack2();
		Stack2 s2 = new Stack2();
		s1.push(2);
		s1.push(1);
		s1.push(3);
		s1.display(s1.top);
		s1.sort(s1, s2);
		System.out.println();
		s1.display(s1.top);
	}
	
}
