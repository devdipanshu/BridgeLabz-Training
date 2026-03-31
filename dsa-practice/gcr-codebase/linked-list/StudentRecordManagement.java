class StudentNode{
	int rollNumber;
	String name;
	int age;
	char grade;
	StudentNode next;
	
	StudentNode(int rollNumber,String name,int age,char grade) {
		this.rollNumber = rollNumber;
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
}
public class StudentRecordManagement {
	public static StudentNode head = null;
	public static StudentNode tail = null;
	static int size = 0;
	public void insertAtBeginning(StudentNode node) {
		if(head == null) {
			head = node;
			tail = node;
		}
		else {
			node.next = head;
			head = node;
		}
		size++;
	}
	public void insertAtLast(StudentNode node) {
		if(head == null) {
			head = node;
		}
		else {
			tail.next = node;
		}
		tail = node;
		size++;
	}
	public void insertAtSpecificPosition(StudentNode node, int idx) {
		int count = 0;
		StudentNode temp = head;
		if(idx == 0) {
			insertAtBeginning(node);
		}
		else if(idx == size) {
			insertAtLast(node);
		}
		else if(idx>size || idx<0) {
			System.out.println("Position is Incorrect");
		}
		else {
			while(count+1<idx && temp!=null && temp.next!=null) {
				count++;
				temp = node.next;
			}
			node.next = temp.next;
			temp.next = node;
		}
		size++;
	}
	public void display(StudentNode head) {
		StudentNode temp = head;
		while(temp!=null) {
			System.out.println(temp.rollNumber+"      "+temp.name+"      "+temp.age+"      "+temp.grade);
			temp = temp.next;
			
		}
	}
	
	public StudentNode deleteUsingRollNumber(StudentNode head, int rollNumber) {
		if(head==null) {
			return null;
		}
		if(head.rollNumber == rollNumber) {
			StudentNode temp = head;
			StudentNode deleted = temp;
			temp = temp.next;
			StudentRecordManagement.head = temp;
			return deleted;
		}
		else {
			StudentNode temp = head;
			while(temp!=null && temp.next!=null) {
				if(temp.next.rollNumber == rollNumber) {
					StudentNode deleted = temp.next;
					temp.next = temp.next.next;
					return deleted;
					
				}
				else {
					temp = temp.next;
				}
			}
		}
		return null;
		
		
	}
	public void searchByRollNumber(StudentNode head, int roll) {
		StudentNode temp = head;
		while(temp!=null) {
			if(temp.rollNumber == roll) {
				System.out.println(temp.rollNumber+"      "+temp.name+"      "+temp.age+"      "+temp.grade);
				return;
			}
			temp = temp.next;
		}
	}
	public void updateStudentGrade(int roll,char grade) {
		StudentNode temp = head;
		while(temp!=null) {
			if(temp.rollNumber == roll) {
				temp.grade = grade;
				return;
			}
			temp = temp.next;
		}
	}
	public static void main(String[] args) {
		StudentNode ram = new StudentNode(17,"Ram",12,'A');
		StudentNode laxman = new StudentNode(18,"laxman",10,'B');
		StudentNode sita = new StudentNode(16,"sita",11,'A');
		StudentRecordManagement obj = new StudentRecordManagement();
		obj.insertAtBeginning(ram);
		obj.insertAtSpecificPosition(laxman, 1);
		obj.insertAtSpecificPosition(sita, 1);
		obj.deleteUsingRollNumber(head, 17);
		obj.display(head);
		obj.searchByRollNumber(head,18);
		obj.updateStudentGrade(18,'A');
		obj.display(head);
	}
}
