package library_management_system;

public class BookNotAvailableException extends Exception{
	BookNotAvailableException(String msg){
		super(msg);
	}
}
