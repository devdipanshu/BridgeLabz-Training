class MovieNode {

	String title;
	String director;
	int yearOfRelease;
	double rating;
	MovieNode next;
	MovieNode prev;
	MovieNode(String title, String director, int yearOfRelease, double rating) {
		this.title = title;
		this.director = director;
		this.yearOfRelease = yearOfRelease;
		this.rating = rating;
	}
}

public class MovieManagementSystem {

	public static MovieNode head = null;
	public static MovieNode tail = null;
	public void insertAtBeginning(MovieNode node) {
		if (head == null) {
			head = node;
			tail = node;
		} else {
			node.next = head;
			head.prev = node;
			head = node;
		}
	}
	public void insertAtEnd(MovieNode node) {
		if (head == null) {
			head = node;
			tail = node;
		} else {
			tail.next = node;
			node.prev = tail;
			tail = node;
		}
	}

	public void insertAtSpecificPosition(MovieNode node, int position) {

		if (position <= 1) {
			insertAtBeginning(node);
			return;
		}

		MovieNode temp = head;
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

	public void removeByTitle(String title) {

		if (head == null) {
			System.out.println("List is Empty");
			return;
		}

		if (head.title.equalsIgnoreCase(title)) {
			head = head.next;
			if (head != null) {
				head.prev = null;
			} else {
				tail = null;
			}
			System.out.println("Movie Removed");
			return;
		}

		MovieNode temp = head;

		while (temp != null) {
			if (temp.title.equalsIgnoreCase(title)) {
				temp.prev.next = temp.next;

				if (temp.next != null) {
					temp.next.prev = temp.prev;
				} else {
					tail = temp.prev;
				}
				return;
			}
			temp = temp.next;
		}
	}
	
	public void searchByDirector(String director) {
		MovieNode temp = head;
		boolean found = false;

		while (temp != null) {
			if (temp.director.equalsIgnoreCase(director)) {
				printMovie(temp);
				found = true;
			}
			temp = temp.next;
		}

		if (found==false) {
			System.out.println("No Movie Found");
		}
	}

	public void searchByRating(double rating) {
		MovieNode temp = head;
		boolean found = false;

		while (temp != null) {
			if (temp.rating == rating) {
				printMovie(temp);
				found = true;
			}
			temp = temp.next;
		}

		if (found==false) {
			System.out.println("No Movie Found");
		}
	}
	public void updateRating(String title, double newRating) {
		MovieNode temp = head;

		while (temp != null) {
			if (temp.title.equalsIgnoreCase(title)) {
				temp.rating = newRating;
				System.out.println("Rating Updated");
				return;
			}
			temp = temp.next;
		}

		System.out.println("Movie Not Found");
	}
	public void displayForward() {
		MovieNode temp = head;
		while (temp != null) {
			printMovie(temp);
			temp = temp.next;
		}
	}

	public void displayReverse() {
		MovieNode temp = tail;
		while (temp != null) {
			printMovie(temp);
			temp = temp.prev;
		}
	}

	public void printMovie(MovieNode temp) {
		System.out.println(temp.title + " | " +temp.director + " | " +temp.yearOfRelease + " | " +temp.rating);
	}

	public static void main(String[] args) {

		MovieManagementSystem obj = new MovieManagementSystem();

		obj.insertAtBeginning(new MovieNode("ABCD", "Prabhudeva", 2012, 9.8));
		obj.insertAtEnd(new MovieNode("Inception", "Nolan", 2015, 9.5));
		obj.insertAtSpecificPosition(new MovieNode("Interstellar", "Nolan", 2026, 9.6), 2);
		System.out.println("Forward Display:");
		obj.displayForward();
		System.out.println("Reverse Display:");
		obj.displayReverse();
		System.out.println("Search by Director:");
		obj.searchByDirector("Nolan");
		System.out.println("Update Rating:");
		obj.updateRating("ABCD", 8.9);
		System.out.println("Remove Movie:");
		obj.removeByTitle("Inception");
		System.out.println("Final List:");
		obj.displayForward();
	}
}
