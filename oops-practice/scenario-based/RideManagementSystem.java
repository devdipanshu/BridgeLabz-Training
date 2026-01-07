import java.util.ArrayList;
import java.util.Scanner;


interface FareCalculator{
	double calculateFare(boolean peak,double distance);
	double calculateFare(double distance);
}
class NoDriverAvailableException extends Exception {
	NoDriverAvailableException(String msg){
		super(msg);
	}
}
class User{
	private String name;
	private int age;
	private String contactNumber;
	private Driver driverAssigned;
	private ArrayList<Ride> userRideHistory = new ArrayList<>();
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getContact() {
		return contactNumber;
	}
	
	public Driver getDriver() {
		return driverAssigned;
	}
	
	User(String name,int age,String contactNumber){
		this.name = name;
		this.age = age;
		this.contactNumber = contactNumber;
	}
	
	
	Ride ride;
	
	void bookRide(double distance, User user) throws NoDriverAvailableException{

		
		if(Driver.rideManagement == null ||Driver.rideManagement.getDrivers().size() == 0) {
			throw new NoDriverAvailableException("Driver is not available");
		}
		else {
			Driver.rideManagement.enlistUser(user);
			driverAssigned = Driver.rideManagement.getDrivers().get(0);
			Driver.rideManagement.getDrivers().get(0).setUser(user);
			Driver.rideManagement.releaseDriver(driverAssigned);
			Driver.rideManagement.releaseUser(user);
		}

		ride = new Ride(name,driverAssigned.getName(),contactNumber,driverAssigned.getContact());
		if(Driver.rideManagement.getUsers().size()>5) {
			double rent = ride.calculateFare(true,distance);
			ride.setFairPrice(rent);
		}
		else {
			double rent = ride.calculateFare(distance);
			ride.setFairPrice(rent);
		}
		userRideHistory.add(ride);
		driverAssigned.addRideToHistory(ride);
	}
	public void displayUserInformation() {
		System.out.println("-----------User----------");
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+this.age);
		System.out.println("Contact Number: "+this.contactNumber);
		System.out.println("Driver Assigned: ");
		if(driverAssigned!=null) {
			System.out.println("        Name: "+driverAssigned.getName());
			System.out.println("        Age: "+driverAssigned.getAge());
			System.out.println("        Experience: "+driverAssigned.getExperience());
			System.out.println();
			System.out.println("Fair Price: "+ride.getFairPrice());
		}

	}
	
	public void displayRideHistory() {
		System.out.println("User Name: "+this.name);
		System.out.println("User Contact Information: "+this.contactNumber);
		System.out.println();
		System.out.println();
		for(Ride key : userRideHistory) {
			System.out.println("Driver Name: "+key.getDriverName());
			System.out.println("Driver Contact Number: "+key.getDriverContactNumber());
			System.out.println("Fair Price: "+key.getFairPrice());
			
		}
	}
}
class Driver{
	private String name;
	private int age;
	private int experience;
	private User userAssigned;
	private String contactNumber;
	
	private ArrayList<Ride> driverRideHistory = new ArrayList<>();
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getExperience() {
		return experience;
	}
	public User getUser() {
		return userAssigned;
	}
	public void setUser(User user) {
		userAssigned = user;
	}
	public String getContact() {
		return contactNumber;
	}
	Driver(String name,int age,int experience,String contactNumber){
		this.name = name;
		this.age = age;
		this.experience = experience;
		this.contactNumber = contactNumber;
		
	}
		
	public void addRideToHistory(Ride ride) {
		driverRideHistory.add(ride);
	}
	public void displayRideHistory() {
		System.out.println("------ Driver Ride History ------");
		System.out.println("Driver Name: " + this.name);
		System.out.println("Contact: " + this.contactNumber);
		System.out.println();

		if(driverRideHistory.size() == 0) {
			System.out.println("No rides completed yet");
			return;
		}

		for(Ride ride : driverRideHistory) {
			System.out.println("User Name: " + ride.getUserName());
			System.out.println("User Contact: " + ride.getUserContactNumber());
			System.out.println("Fare: " + ride.getFairPrice());
			System.out.println("--------------------");
		}
	}

	static RideManagement rideManagement;
	public void loginForRide(Driver driver) {
		rideManagement = new RideManagement();
		rideManagement.enlistDriver(driver);
	}
	public void logoffForRide(Driver driver) {
		if(rideManagement.getDrivers().contains(driver)) {
			rideManagement.releaseDriver(driver);
		}
	}
	void displayDriverInformation() {
		System.out.println("-----------Driver----------");
		System.out.println("Name: "+this.name);
		System.out.println("Age: "+this.age);
		System.out.println("Contact Number: "+this.contactNumber);
		System.out.println("Booked For: ");
		if(userAssigned!=null) {
			System.out.println("        Name: "+userAssigned.getName());
			System.out.println("        Age: "+userAssigned.getAge());
			System.out.println("        Experience: "+userAssigned.getContact());
			System.out.println();
		}
		else {
			System.out.println("No Booking Available");
		}
		
	}	
}
class RideManagement{
	
	private static ArrayList<User> users = new ArrayList<>();
	private static ArrayList<Driver> drivers = new ArrayList<>();
	void enlistUser(User user) {
		users.add(user);
	}
	void releaseUser(User user) {
		users.remove(user);
	}
	void enlistDriver(Driver driver) {
		drivers.add(driver);
	}
	void releaseDriver(Driver driver) {
		drivers.remove(driver);
	}
	ArrayList<Driver> getDrivers(){
		return drivers;
	}
	ArrayList<User> getUsers(){
		return users;
	}
	
}
class Ride implements FareCalculator{
	private String userName;
	private String driverName;
	private String userContactNumber;
	private String driverContactNumber;
	private double fairPrice;
	int fairPerKm = 25;
	int peakFairKm = 35;
	public double calculateFare(double distance) {
		return distance*fairPerKm;
	}
	public double calculateFare(boolean peak,double distance) {
		return distance*peakFairKm;
	}
	public String getUserName(){
		return userName;
	}
	public String getDriverName() {
		return driverName;
	}
	public String getUserContactNumber() {
		return userContactNumber;
	}
	public String getDriverContactNumber() {
		return driverContactNumber;
	}
	public double getFairPrice() {
		return fairPrice;
	}
	public void setFairPrice(double fairPrice) {
		this.fairPrice = fairPrice;
	}
	
	Ride(String userName, String driverName, String userContactNumber,String driverContactNumber){
		this.userName = userName;
		this.driverName = driverName;
		this.userContactNumber = userContactNumber;
		this.driverContactNumber = driverContactNumber;
		
	}
}

public class RideManagementSystem {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int mainChoice = -1;

		ArrayList<User> users = new ArrayList<>();
		ArrayList<Driver> drivers = new ArrayList<>();

		System.out.println("Welcome to Dipanshu Sharma Cab Service");

		while(true) {

			System.out.println("Press 1 : User");
			System.out.println("Press 2 : Driver");
			System.out.println("Press 0 : Exit");
			mainChoice = sc.nextInt();

			if(mainChoice == 0) {
				System.out.println("Thank You for using Cab Service");
				break;
			}

			switch(mainChoice) {
			case 1:
				int userChoice = -1;
				User currentUser = null;

				while(userChoice != 0) {

					System.out.println("USER MENU");
					System.out.println("0 : Back");
					System.out.println("1 : Add New User");
					System.out.println("2 : Book Ride");
					System.out.println("3 : See Ride History");
					userChoice = sc.nextInt();
					switch(userChoice) {

					case 1:
						System.out.println("Enter Name:");
						sc.nextLine();
						String uname = sc.nextLine();

						System.out.println("Enter Age:");
						int uage = sc.nextInt();

						System.out.println("Enter Contact:");
						String ucontact = sc.next();

						currentUser = new User(uname, uage, ucontact);
						users.add(currentUser);

						System.out.println("User Registered Successfully");
						break;

					case 2:
						if(currentUser == null) {
							System.out.println("Please add user first");
							break;
						}

						System.out.println("Enter Distance:");
						double distance = sc.nextDouble();

						try {
							currentUser.bookRide(distance, currentUser);
							System.out.println("Ride Booked Successfully");
							System.out.println("Ride Details:");
							currentUser.displayUserInformation();
						}
						catch(NoDriverAvailableException e) {
							System.out.println(e.getMessage());
						}
						break;

					case 3:
						if(currentUser == null) {
							System.out.println("No user available");
						} else {
							currentUser.displayRideHistory();
						}
						break;

					case 0:
						System.out.println("Returning to Main Menu");
						break;

					default:
						System.out.println("Invalid Choice");
					}
				}
				break;

			case 2:
				int driverChoice = -1;
				Driver currentDriver = null;

				while(driverChoice != 0) {

					System.out.println("DRIVER MENU");
					System.out.println("0 : Back");
					System.out.println("1 : Add New Driver");
					System.out.println("2 : Login for Ride");
					System.out.println("3 : See Ride History");

					driverChoice = sc.nextInt();
					switch(driverChoice) {
					case 1:
						System.out.println("Enter Name:");
						sc.nextLine();
						String dname = sc.nextLine();

						System.out.println("Enter Age:");
						int dage = sc.nextInt();

						System.out.println("Enter Contact:");
						String dcontact = sc.next();

						System.out.println("Enter Experience:");
						int exp = sc.nextInt();

						currentDriver = new Driver(dname, dage, exp, dcontact);
						drivers.add(currentDriver);

						System.out.println("Driver Registered Successfully");
						break;

					case 2:
						if(currentDriver == null) {
							System.out.println("Please add driver first");
						} else {
							currentDriver.loginForRide(currentDriver);
							System.out.println("Driver Logged In for Ride");
						}
						break;

					case 3:
						if(currentDriver == null) {
							System.out.println("No driver available");
						} else {
							currentDriver.displayRideHistory();
						}
						break;

					case 0:
						System.out.println("Returning to Main Menu");
						break;

					default:
						System.out.println("Invalid Choice");
					}
				}
				break;
			default:
				System.out.println("Invalid Option");
			}
		}
		sc.close();
	}

}