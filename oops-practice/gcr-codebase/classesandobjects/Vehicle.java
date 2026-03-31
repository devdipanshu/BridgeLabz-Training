public class Vehicle {
	String ownerName;
	String vehicleType;
	static double registrationFee = 1500.0;
	Vehicle(String ownerName,String vehicleType) {
		this.ownerName = ownerName;
		this.vehicleType = vehicleType;
	}
	public void displayVehicleDetails() {
		System.out.println("Owner Name: "+this.ownerName);
		System.out.println("Vehicle Type: "+this.vehicleType);
		System.out.println("Registration Fee: "+registrationFee);
		System.out.println("-------------------------------");
		System.out.println();
	}
	public static void updateRegistrationFee(double newFee) {
		registrationFee = newFee;
	}
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("Dipanshu Sharma","Car");
		Vehicle v2 = new Vehicle("Rahul Verma","Bike");
		v1.displayVehicleDetails();
		v2.displayVehicleDetails();
		Vehicle.updateRegistrationFee(2000.0);
		v1.displayVehicleDetails();
		v2.displayVehicleDetails();
	}
}
