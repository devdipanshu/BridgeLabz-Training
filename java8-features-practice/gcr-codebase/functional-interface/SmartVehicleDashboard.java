interface Vehicle2{
	void displaySpeed();
	default void displayBattery(){
		System.out.println("Battery feature not supported");
	}
}
class Car2 implements Vehicle2{
	public void displaySpeed(){
		System.out.println("Car speed 80");
	}
}
class ElectricCar2 implements Vehicle2{
	public void displaySpeed(){
		System.out.println("Electric car speed 60");
	}
	public void displayBattery(){
		System.out.println("Battery 75%");
	}
}
public class SmartVehicleDashboard{
	public static void main(String[] args){
		Vehicle2 v1=new Car2();
		Vehicle2 v2=new ElectricCar2();
		v1.displaySpeed();
		v1.displayBattery();
		v2.displaySpeed();
		v2.displayBattery();
	}
}
