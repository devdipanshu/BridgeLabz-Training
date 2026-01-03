interface Refuelable{
	void refuel();
}
class Vehicle2{
	double maxSpeed;
	String model;
	Vehicle2(double maxSpeed,String model){
		this.maxSpeed = maxSpeed;
		this.model = model;
	}
}
class ElectricVehicle extends Vehicle2{
	int batteryCapacity;
	ElectricVehicle(double maxSpeed,String model,int batteryCapacity){
		super(maxSpeed,model);
		this.batteryCapacity = batteryCapacity;
	}
	void charge(){
		System.out.println("Vehicle Type: Electric Vehicle");
		System.out.println("Model: "+this.model);
		System.out.println("Max Speed: "+this.maxSpeed);
		System.out.println("Battery Capacity: "+this.batteryCapacity+" kWh");
		System.out.println("Action: Charging vehicle");
		System.out.println("----------------------------");
		System.out.println();
	}
}
class PetrolVehicle extends Vehicle2 implements Refuelable{
	int fuelTankCapacity;
	PetrolVehicle(double maxSpeed,String model,int fuelTankCapacity){
		super(maxSpeed,model);
		this.fuelTankCapacity = fuelTankCapacity;
	}
	public void refuel(){
		System.out.println("Vehicle Type: Petrol Vehicle");
		System.out.println("Model: "+this.model);
		System.out.println("Max Speed: "+this.maxSpeed);
		System.out.println("Fuel Tank Capacity: "+this.fuelTankCapacity+" liters");
		System.out.println("Action: Refueling vehicle");
		System.out.println("----------------------------");
		System.out.println();
	}
}
public class VehicleManagementSystem {
	public static void main(String[] args) {
		ElectricVehicle ev = new ElectricVehicle(150,"Tesla Model 3",75);
		PetrolVehicle pv = new PetrolVehicle(180,"Honda City",45);
		ev.charge();
		pv.refuel();
	}
}
