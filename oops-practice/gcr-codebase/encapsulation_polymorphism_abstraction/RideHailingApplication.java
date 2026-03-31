package encapsulation_inheritance_polymorphism;

interface GPS {
    void getCurrentLocation();
    void updateLocation(String location);
}

abstract class Vehicle {

    private int vehicleId;
    private String driverName;
    private int ratePerKm;

    abstract int calculateFare(int distance);

    Vehicle(int vehicleId,String driverName,int ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    public void getVehicleDetails() {
        System.out.println("Vehicle Id : "+vehicleId);
        System.out.println("Driver Name: "+driverName);
        System.out.println("Rate Per Km: "+ratePerKm);
    }

    public int getRatePerKm() {
        return ratePerKm;
    }
}

class Car extends Vehicle implements GPS {

    private String location;

    Car(int vehicleId,String driverName,int ratePerKm) {
        super(vehicleId,driverName,ratePerKm);
    }

    int calculateFare(int distance) {
        int fare = getRatePerKm()*distance;
        return fare;
    }

    public void getCurrentLocation() {
        System.out.println("Car Location: "+location);
    }

    public void updateLocation(String location) {
        this.location = location;
    }
}

class Bike extends Vehicle implements GPS {

    private String location;

    Bike(int vehicleId,String driverName,int ratePerKm) {
        super(vehicleId,driverName,ratePerKm);
    }

    int calculateFare(int distance) {
        int fare = (getRatePerKm()*distance) - 20; // cheaper ride
        return fare;
    }

    public void getCurrentLocation() {
        System.out.println("Bike Location: "+location);
    }

    public void updateLocation(String location) {
        this.location = location;
    }
}

class Auto extends Vehicle implements GPS {

    private String location;

    Auto(int vehicleId,String driverName,int ratePerKm) {
        super(vehicleId,driverName,ratePerKm);
    }

    int calculateFare(int distance) {
        int fare = (getRatePerKm()*distance) + 30; // extra charges
        return fare;
    }

    public void getCurrentLocation() {
        System.out.println("Auto Location: "+location);
    }

    public void updateLocation(String location) {
        this.location = location;
    }
}

public class RideHailingApplication {

    public static void calculateTotalFare(Vehicle[] list,int distance) {

        for(int i = 0;i<list.length;i++) {

            list[i].getVehicleDetails();

            int fare = list[i].calculateFare(distance);
            System.out.println("Distance   : "+distance+" km");
            System.out.println("Total Fare : "+fare);

            GPS g = (GPS)list[i];
            g.getCurrentLocation();

            System.out.println();
        }
    }

    public static void main(String[] args) {

        Vehicle v1 = new Car(101,"Amit",15);
        Vehicle v2 = new Bike(102,"Rahul",10);
        Vehicle v3 = new Auto(103,"Suresh",12);

        GPS g1 = (GPS)v1;
        GPS g2 = (GPS)v2;
        GPS g3 = (GPS)v3;

        g1.updateLocation("Sector 18");
        g2.updateLocation("Railway Station");
        g3.updateLocation("Bus Stand");

        Vehicle[] vehicles = {v1,v2,v3};

        calculateTotalFare(vehicles,10);
    }
}
