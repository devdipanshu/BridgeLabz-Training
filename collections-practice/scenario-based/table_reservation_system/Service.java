package table_reservation_system;

import java.util.*;

public class Service {
	private static ArrayList<Reservation> reservations = new ArrayList<>();
	private static HashMap<Integer,Table> map = new HashMap<>();
	public void toggleTableStatus(Table t) {
		if(t.isBooked == false) {
			t.isBooked = true;
		}
		else {
			t.isBooked = false;
		}
	}
	public void addTable(Table table){
		map.put(table.tableId, table);
	}
	public void addReservation(Reservation reservation) {
		reservations.add(reservation);
	}
	public void showAvailableTables() {
		System.out.println("Table Id      Price      Booked");
		for(int key: map.keySet()) {
			System.out.println("  "+key+"         "+map.get(key).tablePrice+"      "+map.get(key).isBooked);
		}
	}
	public void reserveTable(int id,int h,User u) throws TableAlreadyReservedException{
		Table table = map.get(id);
		if(table.isBooked) {
			throw new TableAlreadyReservedException("Table is already reserved");
		}
		else {
			Reservation res = new Reservation(table,u,h);
			addReservation(res);
			toggleTableStatus(table);
		}
	}
	public void cancelReservation(int tableId,int userId) {
		Reservation res = null;
		for(int key: map.keySet() ) {
			if(key == tableId) {
				toggleTableStatus(map.get(key));
			}
		}
		for(Reservation reserve: reservations) {
			if(reserve.table.tableId == tableId && reserve.user.id == userId) {
				res = reserve;
				break;
			}
		}
		if(res == null) {
			System.out.println("Record doesnot found");
		}
		else {
			reservations.remove(res);
		}
		
	}
}
