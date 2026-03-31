public class CarRental {
	String customerName;
	String carModel;
	int rentalDays;
	double totalCost;
	CarRental(String customerName,String carModel,int rentalDays) {
		this.customerName = customerName;
		this.carModel = carModel;
		this.rentalDays = rentalDays;
		this.calculateCost();
	}
	
	public void calculateCost() {
		double perDayAmount = 1000.0;
		this.totalCost = this.rentalDays * perDayAmount;
	}
	
	public void display() {
		System.out.println("Customer Name: "+this.customerName);
		System.out.println("Car Model: "+this.carModel);
		System.out.println("Rental Days: "+this.rentalDays);
		System.out.println("Total Cost: "+this.totalCost);
		
		
	}
	
	public static void main(String[] args) {
		CarRental rental = new CarRental("Rahul","Creta",5);
		System.out.println("Rental Details: ");
		rental.display();
	}
}
