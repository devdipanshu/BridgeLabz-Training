package browser_buddy;

import java.util.Stack;

public class ClosedTabStack {
	Stack<TabHistory> stack = new Stack<>();

	public void close(TabHistory tab){
		stack.push(tab);
	}

	public TabHistory reopen(){
		if(stack.isEmpty()){
			return null;
		}
		return stack.pop();
	}
}
