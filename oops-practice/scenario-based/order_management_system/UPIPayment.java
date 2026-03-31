package order_management_system;

public class UPIPayment implements Payment{
    @Override
	public boolean payAmount (double amount)throws PaymentFailedException{
		if(amount<0) {
			throw new PaymentFailedException("Invalid Amount");
		}
		else {
			System.out.println("Payment Completed With UPI");
			return true;
		}
	}
}
