package table_reservation_system;

public class Reservation {
	Table table;
	User user;
	int hour;
	Reservation(Table table,User user,int hour){
		this.table = table;
		this.user = user;
		this.hour = hour;
	}
}
