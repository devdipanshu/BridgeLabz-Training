package bookshelf;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.HashSet;

public class BookShelf {

	HashMap<String,LinkedList<Book>> catalog = new HashMap<>();
	HashSet<String> uniqueBooks = new HashSet<>();

	public void addBook(String genre,Book book){
		String key = genre+book.title+book.author;
		if(uniqueBooks.contains(key)){
			System.out.println("Duplicate Book");
			return;
		}

		catalog.putIfAbsent(genre,new LinkedList<>());
		catalog.get(genre).add(book);
		uniqueBooks.add(key);
	}

	public void borrowBook(String genre,String title){
		if(!catalog.containsKey(genre)){
			return;
		}
		LinkedList<Book> list = catalog.get(genre);
		for(Book b : list){
			if(b.title.equals(title)){
				list.remove(b);
				uniqueBooks.remove(genre+b.title+b.author);
				return;
			}
		}
	}

	public void returnBook(String genre,Book book){
		addBook(genre,book);
	}

	public void display(){
		for(String genre : catalog.keySet()){
			System.out.println("Genre : "+genre);
			for(Book b : catalog.get(genre)){
				System.out.println(b);
			}
		}
	}
}
