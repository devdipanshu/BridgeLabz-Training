package main;

import catalog.LibraryCatalog;
import factory.UserFactory;
import observer.User;
import builder.Book;

public class LibraryApplication {

    public static void main(String[] args) {

        LibraryCatalog catalog = LibraryCatalog.getInstance();

        User student = UserFactory.createUser("student", "Alice");
        User faculty = UserFactory.createUser("faculty", "Dr Cormen");

        student.showRole();
        faculty.showRole();

        catalog.addObserver(student);
        catalog.addObserver(faculty);

        Book book = new Book.BookBuilder("Data Structures")
                        .authors("Cormen")
                        .edition("3rd")
                        .genre("Computer Science")
                        .publisher("MIT Press")
                        .build();

        catalog.addBook(book);
    }
}
