package table_reservation_system;

public class User {
	String name;
	int id;
	User(String name,int id){
		this.name = name;
		this.id = id;
	}
	Service s = new Service();
	public void showTables() {
		s.showAvailableTables();
	}
	public void reserveTable(int id,int h,User u) throws TableAlreadyReservedException{
		s.reserveTable(id, h,u);
	}
	public void cancelReservation(int tableId,int userId) {
		s.cancelReservation(tableId, userId);
	}
}
