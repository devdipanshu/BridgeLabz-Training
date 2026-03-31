import java.util.*;

public class StackUsingQueues {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    void push(int x) {
        q1.add(x);
    }
    int pop() {
        if(q1.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        while(q1.size() > 1) {
            q2.add(q1.remove());
        }
        int top = q1.remove();
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return top;
    }
    int top() {
        if(q1.isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        }

        while(q1.size() > 1) {
            q2.add(q1.remove());
        }

        int top = q1.remove();
        q2.add(top);
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;

        return top;
    }

    boolean isEmpty() {
        return q1.isEmpty();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StackUsingQueues stack = new StackUsingQueues();

        System.out.print("Enter number of elements to push: ");
        int n = sc.nextInt();
        System.out.println("Enter elements:");
        for(int i = 0;i < n;i++) {
            stack.push(sc.nextInt());
        }

        System.out.println("Top element: " + stack.top());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Top after pop: " + stack.top());
    }
}
