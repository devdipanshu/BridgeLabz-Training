package app;

import singleton.LibraryCatalog;
import factory.*;
import builder.Book;

public class LibraryApp{
    public static void main(String[] args){
        LibraryCatalog catalog=LibraryCatalog.getInstance();

        User s1=UserFactory.createUser("student","Alice");
        User f1=UserFactory.createUser("faculty","Dr. Bob");

        s1.showRole();
        f1.showRole();

        catalog.addObserver(s1);
        catalog.addObserver(f1);

        Book book=new Book.BookBuilder("Design Patterns")
                .author("GoF")
                .edition("2nd")
                .genre("Software Engineering")
                .build();

        catalog.addBook(book);
    }
}
