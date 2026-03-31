package table_reservation_system;

public class Table {
	int tableId;
	double tablePrice;
	boolean isBooked;
	Table(int tableId,double tablePrice,boolean isBooked){
		this.tableId = tableId;
		this.tablePrice = tablePrice;
		this.isBooked = isBooked;
	}
	public void enlistTable(Table t) {
		Service s = new Service();
		s.addTable(t);
	}
}
