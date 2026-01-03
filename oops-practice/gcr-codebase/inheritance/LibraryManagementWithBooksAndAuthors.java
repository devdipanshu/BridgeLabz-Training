class Book{
	String title;
	int publicationYear;
	Book(String title, int publicationYear){
		this.title = title;
		this.publicationYear = publicationYear;
	}
	void displayInfo() {
		System.out.println("Title: "+this.title);
		System.out.println("Publication Year: "+this.publicationYear);
		System.out.println();
	}
}
class Author extends Book{
	String name;
	String bio;
	Author(String title, int publicationYear,String name,String bio){
		super(title,publicationYear);
		this.name = name;
		this.bio = bio;
	}
	void displayInfo() {
		System.out.println("Title: "+this.title);
		System.out.println("Publication Year: "+this.publicationYear);
		System.out.println("Name: "+this.name);
		System.out.println("Bio: "+this.bio);
		System.out.println();
	}
}
public class LibraryManagementWithBooksAndAuthors {
	public static void main(String[] args) {
		Book book = new Book("Gunaho Ka Devta",1855);
		Author author = new Author("Gunaho Ka Devta",1855,"Dharamveer Bharti","A Passionate Writter");
		System.out.println("Book Detail: ");
		book.displayInfo();
		System.out.println("Author Detail: ");
		author.displayInfo();
	}
	
}
