package bookshelf;

public class Main {
	public static void main(String[] args){

		BookShelf shelf = new BookShelf();

		shelf.addBook("Fiction",new Book("1984","George Orwell"));
		shelf.addBook("Fiction",new Book("Animal Farm","George Orwell"));
		shelf.addBook("Science",new Book("Brief History of Time","Stephen Hawking"));

		shelf.display();

		shelf.borrowBook("Fiction","1984");

		System.out.println();

		shelf.display();

		shelf.returnBook("Fiction",new Book("1984","George Orwell"));

		System.out.println();

		shelf.display();
	}
}
