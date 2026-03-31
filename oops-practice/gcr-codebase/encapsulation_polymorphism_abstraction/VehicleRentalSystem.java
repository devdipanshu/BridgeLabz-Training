package encapsulation_inheritance_polymorphism;

interface Insurable {
    int calculateInsurance();
    void getInsuranceDetails();
}

abstract class Vehicle2 {
    private String vehicleNumber;
    private String type;
    private int rentalRate;

    abstract int calculateRentalCost(int days);

    Vehicle2(String vehicleNumber, String type, int rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public int getRentalRate() {
        return rentalRate;
    }
}

class Car2 extends Vehicle2 implements Insurable {

    Car2(String vehicleNumber, int rentalRate) {
        super(vehicleNumber,"Car",rentalRate);
    }

    int calculateRentalCost(int days) {
        int cost = getRentalRate()*days;
        return cost;
    }

    public int calculateInsurance() {
        int insurance = 500;
        return insurance;
    }

    public void getInsuranceDetails() {
        System.out.println("Car Insurance: "+calculateInsurance());
    }
}

class Bike2 extends Vehicle2 implements Insurable {

    Bike2(String vehicleNumber, int rentalRate) {
        super(vehicleNumber,"Bike",rentalRate);
    }

    int calculateRentalCost(int days) {
        int cost = getRentalRate()*days;
        return cost;
    }

    public int calculateInsurance() {
        int insurance = 200;
        return insurance;
    }

    public void getInsuranceDetails() {
        System.out.println("Bike Insurance: "+calculateInsurance());
    }
}

class Truck2 extends Vehicle2 implements Insurable {

    Truck2(String vehicleNumber, int rentalRate) {
        super(vehicleNumber,"Truck",rentalRate);
    }

    int calculateRentalCost(int days) {
        int cost = (getRentalRate()*days)+1000;
        return cost;
    }

    public int calculateInsurance() {
        int insurance = 1000;
        return insurance;
    }

    public void getInsuranceDetails() {
        System.out.println("Truck Insurance: "+calculateInsurance());
    }
}

public class VehicleRentalSystem {

    public static void calculateTotalCost(Vehicle2[] list,int days) {

        int totalAmount = 0;

        for(int i = 0;i<list.length;i++) {
            int rentalCost = list[i].calculateRentalCost(days);
            Insurable ins = (Insurable)list[i];
            int insuranceCost = ins.calculateInsurance();
            ins.getInsuranceDetails();
            totalAmount = totalAmount + rentalCost + insuranceCost;
        }

        System.out.println("Total Rental Amount: "+totalAmount);
    }

    public static void main(String[] args) {

        Vehicle2 v1 = new Car2("UP14AB1234",500);
        Vehicle2 v2 = new Bike2("DL09XY5678",300);
        Vehicle2 v3 = new Truck2("HR26TR9999",1000);

        Vehicle2[] vehicles = {v1,v2,v3};

        calculateTotalCost(vehicles,3);
    }
}
