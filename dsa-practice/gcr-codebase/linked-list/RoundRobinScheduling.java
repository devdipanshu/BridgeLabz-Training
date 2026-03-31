class ProcessNode {

	int processId;
	int burstTime;
	int remainingTime;
	int priority;
	int waitingTime;
	int turnaroundTime;
	ProcessNode next;
	ProcessNode(int processId, int burstTime, int priority) {
		this.processId = processId;
		this.burstTime = burstTime;
		this.remainingTime = burstTime;
		this.priority = priority;
	}
}

public class RoundRobinScheduling {
	public static ProcessNode head = null;
	public static ProcessNode tail = null;
	public void addProcess(ProcessNode node) {
		if (head == null) {
			head = node;
			tail = node;
			node.next = head;
		} else {
			tail.next = node;
			tail = node;
			tail.next = head;
		}
	}

	public void removeProcess(int processId) {
		if (head == null) {
			return;
		}
		if (head.processId == processId && head == tail) {
			head = null;
			tail = null;
			return;
		}
		if (head.processId == processId) {
			tail.next = head.next;
			head = head.next;
			return;
		}
		ProcessNode temp = head;
		while (temp.next != head) {
			if (temp.next.processId == processId) {
				if (temp.next == tail) {
					tail = temp;
				}
				temp.next = temp.next.next;
				return;
			}
			temp = temp.next;
		}
	}
	public void displayProcesses() {
		if (head == null) {
			System.out.println("No Processes");
			return;
		}
		ProcessNode temp = head;
		do {
			System.out.println("P" + temp.processId + " | Remaining: " + temp.remainingTime);
			temp = temp.next;
		} while (temp != head);
	}

	public void simulateRoundRobin(int timeQuantum) {

		if (head == null) {
			System.out.println("No Process Available");
			return;
		}
		ProcessNode temp = head;
		int time = 0;
		int totalWaitingTime = 0;
		int totalTurnaroundTime = 0;
		int completed = 0;
		while (head != null) {
			if (temp.remainingTime > 0) {
				if (temp.remainingTime > timeQuantum) {
					time = time + timeQuantum;
					temp.remainingTime = temp.remainingTime - timeQuantum;
				} else {
					time = time + temp.remainingTime;
					temp.remainingTime = 0;
					temp.turnaroundTime = time;
					temp.waitingTime = temp.turnaroundTime - temp.burstTime;
					totalWaitingTime = totalWaitingTime + temp.waitingTime;
					totalTurnaroundTime = totalTurnaroundTime + temp.turnaroundTime;
					int id = temp.processId;
					temp = temp.next;
					removeProcess(id);
					completed++;
					displayProcesses();
					continue;
				}
			}
			temp = temp.next;
			displayProcesses();
		}
		System.out.println("Average Waiting Time: " + (double) totalWaitingTime / completed);
		System.out.println("Average Turnaround Time: " + (double) totalTurnaroundTime / completed);
	}
	public static void main(String[] args) {

		RoundRobinScheduling obj = new RoundRobinScheduling();

		obj.addProcess(new ProcessNode(1, 10, 1));
		obj.addProcess(new ProcessNode(2, 5, 2));
		obj.addProcess(new ProcessNode(3, 8, 1));

		obj.simulateRoundRobin(3);
	}
}
