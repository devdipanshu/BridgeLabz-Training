package encapsulation_inheritance_polymorphism;

interface Taxable {
	int calculateTax();
	void getTaxDetails();
}
abstract class Product{
	private int productId;
	private String name;
	private int price;
	
	abstract int calculateDiscount();
	
	Product(int productId, String name, int price){
		this.productId = productId;
		this.name = name;
		this.price = price;
	}
	
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return this.price;
	}
	public int getProductId() {
		return this.productId;
	}
	public String getName() {
		return this.name;
	}
}

class Electronics extends Product implements Taxable{
	Electronics(int productId, String name, int price){
		super(productId,name,price);
	}
	int calculateDiscount() {
		int result = getPrice()*10/100;  //10% off on electronics
		return result;
	}
	public int calculateTax() {
		int tax = getPrice()*3/100;          //3% taxes on electronics
		return tax;
	}
	public void getTaxDetails() {
		System.out.println("Taxes on Electronics: 3%");
	}
	
}
class Clothing extends Product implements Taxable{
	Clothing(int productId, String name, int price){
		super(productId,name,price);
	}
	int calculateDiscount() {
		int result = getPrice()*15/100;  //15% off on clothing
		return result;
	}
	public int calculateTax() {
		int tax = getPrice()*5/100;          //5% taxes on Clothing
		return tax;
	}
	public void getTaxDetails() {
		System.out.println("Taxes on Clothing: 5%");
	}
}
class Groceries extends Product implements Taxable{
	Groceries(int productId, String name, int price){
		super(productId,name,price);
	}
	int calculateDiscount() {
		int result = getPrice()*20/100;  //20% off on Groceries
		return result;
	}
	public int calculateTax() {
		int tax = getPrice()*3/100;          //3% taxes on Groceries
		return tax;
	}
	public void getTaxDetails() {
		System.out.println("Taxes on Groceries: 3%");
	}
}
public class ECommercePlatform {
	public static void calculateAndPrintFinalPrice(Product[] list) {
		int totalPrice = 0;
		for(int i = 0;i<list.length;i++) {
			int price = list[i].getPrice();
			int discount = list[i].calculateDiscount();
			Taxable t = (Taxable)list[i];
			int tax = t.calculateTax();
			totalPrice = totalPrice+(price-discount+tax);
			t.getTaxDetails();
			
		}
		
		System.out.println("Final Price is: "+totalPrice);
	}
	public static void main(String[] args) {
		Product p1 = new Electronics(101,"fan",1000);
		Product p2 = new Clothing(102,"jacket",1200);
		Product p3 = new Groceries(103,"flour",500);
		
		Product[] products = {p1,p2,p3};
		calculateAndPrintFinalPrice(products);
	}
}
