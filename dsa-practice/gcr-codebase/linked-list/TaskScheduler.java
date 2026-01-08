class TaskNode {

	int taskId;
	String taskName;
	int priority;
	String dueDate;
	TaskNode next;

	TaskNode(int taskId, String taskName, int priority, String dueDate) {
		this.taskId = taskId;
		this.taskName = taskName;
		this.priority = priority;
		this.dueDate = dueDate;
	}
}

public class TaskScheduler {

	public static TaskNode head = null;

	public void insertAtBeginning(TaskNode node) {
		if (head == null) {
			head = node;
			node.next = head;
		} else {
			TaskNode temp = head;
			while (temp.next != head) {
				temp = temp.next;
			}
			node.next = head;
			temp.next = node;
			head = node;
		}
	}
	public void insertAtEnd(TaskNode node) {
		if (head == null) {
			head = node;
			node.next = head;
		} else {
			TaskNode temp = head;
			while (temp.next != head) {
				temp = temp.next;
			}
			temp.next = node;
			node.next = head;
		}
	}
	public void insertAtSpecificPosition(TaskNode node, int position) {
		if (position <= 1) {
			insertAtBeginning(node);
			return;
		}
		TaskNode temp = head;
		int count = 1;

		while (temp.next != head && count < position - 1) {
			temp = temp.next;
			count++;
		}
		node.next = temp.next;
		temp.next = node;
	}
	public void removeByTaskId(int taskId) {
		if (head == null) {
			System.out.println("No Task Available");
			return;
		}
		if (head.taskId == taskId) {
			if (head.next == head) {
				head = null;
				return;
			}
			TaskNode temp = head;
			while (temp.next != head) {
				temp = temp.next;
			}
			head = head.next;
			temp.next = head;
			return;
		}
		TaskNode curr = head;
		while (curr.next != head) {
			if (curr.next.taskId == taskId) {
				curr.next = curr.next.next;
				return;
			}
			curr = curr.next;
		}
		System.out.println("Task Not Found");
	}
	public void viewCurrentAndMoveNext() {
		if (head == null) {
			System.out.println("No Task Available");
			return;
		}
		System.out.println(head.taskId + " | " +head.taskName + " | " +head.priority + " | " +head.dueDate);
		head = head.next;
	}

	public void displayTasks() {

		if (head == null) {
			System.out.println("No Task Available");
			return;
		}

		TaskNode temp = head;

		do {
			System.out.println(
				temp.taskId + " | " +
				temp.taskName + " | " +
				temp.priority + " | " +
				temp.dueDate
			);
			temp = temp.next;
		} while (temp != head);
	}

	public void searchByPriority(int priority) {

		if (head == null) {
			System.out.println("No Task Available");
			return;
		}

		TaskNode temp = head;
		boolean found = false;

		do {
			if (temp.priority == priority) {
				System.out.println(temp.taskId + " | " +temp.taskName + " | " +temp.priority + " | " +temp.dueDate);
				found = true;
			}
			temp = temp.next;
		} while (temp != head);

		if (found == false) {
			System.out.println("No Task Found");
		}
	}

	public static void main(String[] args) {

		TaskScheduler obj = new TaskScheduler();
		obj.insertAtBeginning(new TaskNode(1, "Backup", 2, "10-02-2026"));
		obj.insertAtEnd(new TaskNode(2, "Code Review", 1, "12-02-2026"));
		obj.insertAtSpecificPosition(new TaskNode(3, "Deploy", 1, "15-02-2026"), 2);
		obj.displayTasks();
		obj.searchByPriority(1);
		obj.viewCurrentAndMoveNext();
		obj.removeByTaskId(2);
		obj.displayTasks();
	}
}
