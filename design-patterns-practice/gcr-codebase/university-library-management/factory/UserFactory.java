package factory;

import observer.User;

public class UserFactory {

    public static User createUser(String role, String name) {

        if(role.equalsIgnoreCase("student")) {
            return new Student(name);
        }
        else if(role.equalsIgnoreCase("faculty")) {
            return new Faculty(name);
        }
        else if(role.equalsIgnoreCase("librarian")) {
            return new Librarian(name);
        }
        else {
            throw new IllegalArgumentException("Invalid User Role");
        }
    }
}
