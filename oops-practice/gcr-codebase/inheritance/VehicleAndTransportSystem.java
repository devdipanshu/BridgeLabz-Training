class Vehicle{
	double maxSpeed;
	String fuelType;
	Vehicle(double maxSpeed, String fuelType){
		this.maxSpeed = maxSpeed;
		this.fuelType = fuelType;
	}
	void displayInfo() {
		System.out.println("Max Speed: "+this.maxSpeed);
		System.out.println("Fuel Type: "+this.fuelType);
		System.out.println("--------------------------------");
		System.out.println();
	}
}
	
class Car extends Vehicle{
	int seatCapacity;
	Car(double maxSpeed, String fuelType, int seatCapacity){
		super(maxSpeed,fuelType);
		this.seatCapacity = seatCapacity;
	}
	void displayInfo() {
		System.out.println("Max Speed: "+this.maxSpeed);
		System.out.println("Fuel Type: "+this.fuelType);
		System.out.println("Seat Capacity: "+this.seatCapacity);
		System.out.println("--------------------------------");
		System.out.println();
	}
}
class Truck extends Vehicle{
	int numberOfTyres;
	Truck(double maxSpeed, String fuelType, int numberOfTyres){
		super(maxSpeed,fuelType);
		this.numberOfTyres = numberOfTyres;
	}
	void displayInfo() {
	System.out.println("Max Speed: "+this.maxSpeed);
		System.out.println("Fuel Type: "+this.fuelType);
		System.out.println("Number Of Tyres: "+this.numberOfTyres);
		System.out.println("--------------------------------");
		System.out.println();
	}
}
class MotorCycle extends Vehicle{
	boolean withSideCar;
	MotorCycle(double maxSpeed, String fuelType, boolean withSideCar){
		super(maxSpeed,fuelType);
		this.withSideCar = withSideCar;
	}
	void displayInfo() {
		System.out.println("Max Speed: "+this.maxSpeed);
		System.out.println("Fuel Type: "+this.fuelType);
		System.out.println("With Side Car(True/False): "+this.withSideCar);
		System.out.println("--------------------------------");
		System.out.println();
	}
}
public class VehicleAndTransportSystem {
	public static void main(String[] args) {
		Vehicle[] info = new Vehicle[3];
		Car car = new Car(180,"petrol",5);
		Truck truck = new Truck(140,"Diesel",12);
		MotorCycle bike = new MotorCycle(110,"EV",false);
		info[0] = car;
		info[1] = truck;
		info[2] = bike;
		for(int i = 0;i<info.length;i++) {
			info[i].displayInfo();
		}
	}
}
