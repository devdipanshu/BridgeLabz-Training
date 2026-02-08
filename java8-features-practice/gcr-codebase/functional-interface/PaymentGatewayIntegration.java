
interface PaymentProcessor{
	void pay();
	default void refund(){
		System.out.println("Refund processed");
	}
}
class UPIProcessor implements PaymentProcessor{
	public void pay(){
		System.out.println("UPI payment done");
	}
}
class CardProcessor implements PaymentProcessor{
	public void pay(){
		System.out.println("Card payment done");
	}
}
public class PaymentGatewayIntegration{
	public static void main(String[] args){
		PaymentProcessor p1=new UPIProcessor();
		PaymentProcessor p2=new CardProcessor();
		p1.pay();
		p1.refund();
		p2.pay();
		p2.refund();
	}
}
