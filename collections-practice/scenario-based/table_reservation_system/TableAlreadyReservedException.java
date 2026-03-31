package table_reservation_system;

public class TableAlreadyReservedException extends Exception{
	TableAlreadyReservedException(String msg){
		super(msg);
	}
}
