package table_reservation_system;

public class Main {
	public static void main(String[] args) {
		Table t1 = new Table(101,200,false);
		Table t2 = new Table(102,300,false);
		User u = new User("Dipanshu",11);
		Service s = new Service();
		s.addTable(t1);
		s.addTable(t2);
		u.showTables();
		try {
			u.reserveTable(101, 2, u);
		}
		catch(TableAlreadyReservedException e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
		u.showTables();
	}
}