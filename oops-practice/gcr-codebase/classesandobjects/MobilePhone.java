public class MobilePhone {
	String brand;
	String model;
	double price;
	MobilePhone(String brand,String model,double price){
		this.brand = brand;
		this.model = model;
		this.price = price;
	}
	public void displayMobileDetails() {
		System.out.println("Brand of mobile: "+this.brand);
		System.out.println("Model of mobile: "+this.model);
		System.out.println("Price of mobile: "+this.price);
		System.out.println("------------------------------");
	}
	public static void main(String[] args) {
		MobilePhone m1 = new MobilePhone("VIVO","VIVO V29",15999.0);
		MobilePhone m2 = new MobilePhone("ONE PLUS","ONE PLUS nord4",39999.0);
		MobilePhone m3 = new MobilePhone("APPLE","iphone pro16",79999.0);
		m1.displayMobileDetails();
		m2.displayMobileDetails();
		m3.displayMobileDetails();
	}
}
