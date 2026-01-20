package bookshelf;

public class Book {
	String title;
	String author;

	Book(String title,String author){
		this.title = title;
		this.author = author;
	}

	public String toString(){
		return title+" by "+author;
	}
}
