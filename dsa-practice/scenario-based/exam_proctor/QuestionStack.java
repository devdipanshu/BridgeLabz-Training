package exam_proctor;

import java.util.Stack;

public class QuestionStack {
	Stack<Integer> stack = new Stack<>();

	public void visit(int qid){
		stack.push(qid);
	}

	public int lastVisited(){
		if(stack.isEmpty()){
			return -1;
		}
		return stack.peek();
	}
}
