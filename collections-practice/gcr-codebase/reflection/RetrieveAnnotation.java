import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Retention(RetentionPolicy.RUNTIME)
@interface Author {
	String name();
}
@Author(name = "Author Name")
class Book {
}
public class RetrieveAnnotation {
	public static void main(String[] args) {
		Class c = Book.class;
		if(c.isAnnotationPresent(Author.class)) {
			Author a = (Author)c.getAnnotation(Author.class);
			System.out.println("Author Name : " + a.name());
		}
	}
}
