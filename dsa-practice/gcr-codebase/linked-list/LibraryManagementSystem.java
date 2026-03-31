class BookNode {
	int bookId;
	String title;
	String author;
	String genre;
	boolean available;
	BookNode next;
	BookNode prev;
	BookNode(int bookId, String title, String author, String genre, boolean available) {
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.available = available;
	}
}
public class LibraryManagementSystem {
	public static BookNode head = null;
	public static BookNode tail = null;
	public void insertAtBeginning(BookNode node) {
		if (head == null) {
			head = node;
			tail = node;
		} else {
			node.next = head;
			head.prev = node;
			head = node;
		}
	}
	public void insertAtEnd(BookNode node) {
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			node.prev = tail;
			tail = node;
		}
	}
	public void insertAtSpecificPosition(BookNode node, int position) {
		if (position <= 1) {
			insertAtBeginning(node);
			return;
		}
		BookNode temp = head;
		int count = 1;
		while (temp != null && count < position - 1) {
			temp = temp.next;
			count++;
		}
		if (temp == null || temp.next == null) {
			insertAtEnd(node);
		} else {
			node.next = temp.next;
			node.prev = temp;
			temp.next.prev = node;
			temp.next = node;
		}
	}
	public void removeByBookId(int bookId) {
		if (head == null) {
			System.out.println("Library Empty");
			return;
		}
		if (head.bookId == bookId) {
			head = head.next;
			if (head != null) {
				head.prev = null;
			} else {
				tail = null;
			}
			System.out.println("Book Removed");
			return;
		}
		BookNode temp = head;
		while (temp != null) {
			if (temp.bookId == bookId) {
				temp.prev.next = temp.next;
				if (temp.next != null) {
					temp.next.prev = temp.prev;
				} else {
					tail = temp.prev;
				}
				System.out.println("Book Removed");
				return;
			}
			temp = temp.next;
		}
		System.out.println("Book Not Found");
	}
	public void searchByTitle(String title) {
		BookNode temp = head;
		boolean found = false;
		while (temp != null) {
			if (temp.title.equalsIgnoreCase(title)) {
				System.out.println(temp.bookId + " | " + temp.title + " | " + temp.author + " | " + temp.genre + " | " + temp.available);
				found = true;
			}
			temp = temp.next;
		}
		if (found == false) {
			System.out.println("Book Not Found");
		}
	}
	public void searchByAuthor(String author) {
		BookNode temp = head;
		boolean found = false;
		while (temp != null) {
			if (temp.author.equalsIgnoreCase(author)) {
				System.out.println(temp.bookId + " | " + temp.title + " | " + temp.author + " | " + temp.genre + " | " + temp.available);
				found = true;
			}
			temp = temp.next;
		}
		if (found == false) {
			System.out.println("Book Not Found");
		}
	}
	public void updateAvailability(int bookId, boolean status) {

		BookNode temp = head;
		while (temp != null) {
			if (temp.bookId == bookId) {
				temp.available = status;
				System.out.println("Availability Updated");
				return;
			}
			temp = temp.next;
		}

		System.out.println("Book Not Found");
	}

	public void displayForward() {

		BookNode temp = head;
		while (temp != null) {
			System.out.println(temp.bookId + " | " + temp.title + " | " + temp.author + " | " + temp.genre + " | " + temp.available);
			temp = temp.next;
		}
	}
	public void displayReverse() {

		BookNode temp = tail;
		while (temp != null) {
			System.out.println(temp.bookId + " | " + temp.title + " | " + temp.author + " | " + temp.genre + " | " + temp.available);
			temp = temp.prev;
		}
	}
	public void countBooks() {

		BookNode temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			temp = temp.next;
		}
		System.out.println("Total Books: " + count);
	}

	public static void main(String[] args) {

		LibraryManagementSystem obj = new LibraryManagementSystem();
		obj.insertAtBeginning(new BookNode(1, "Java", "Herbert", "Programming", true));
		obj.insertAtEnd(new BookNode(2, "DSA", "Narasimha", "Computer", true));
		obj.insertAtSpecificPosition(new BookNode(3, "Python", "Guido", "Programming", false), 2);
		obj.displayForward();
		obj.searchByAuthor("Guido");
		obj.updateAvailability(2, false);
		obj.displayReverse();
		obj.countBooks();
		obj.removeByBookId(1);
		obj.displayForward();
	}
	
}
