class Device{
	int deviceId;
	String status;
	Device(int deviceId,String status){
		this.deviceId = deviceId;
		this.status = status;
	}
	void displayStatus() {
		System.out.println("Device Id: "+this.deviceId);
		System.out.println("Device Status: "+this.status);
		System.out.println();
	}
}
class Thermostat extends Device{
	int temperatureSetting;
	Thermostat(int deviceId,String status, int temperatureSetting){
		super(deviceId,status);
		this.temperatureSetting = temperatureSetting;
	}
	void displayStatus() {
		System.out.println("Device Id: "+this.deviceId);
		System.out.println("Device Status: "+this.status);
		System.out.println("Temperature Setting: "+this.temperatureSetting);
		System.out.println();
	}
}
public class SmartHomeDevice {
	public static void main(String[] args) {
		
		Device device = new Device(101,"idle");
		device.displayStatus();
		Thermostat thermostat = new Thermostat(101,"idle",24);
		thermostat.displayStatus();
	}
	
}
