class Order{
	int orderId;
	String orderDate;
	Order(int orderId, String orderDate){
		this.orderId = orderId;
		this.orderDate = orderDate;
	}
	void getOrderStatus() {
		System.out.println("Order Id: "+this.orderId);
		System.out.println("Order Date: "+this.orderDate);
		System.out.println("---------------------");
		System.out.println();
	}
	
}

class ShippedOrder extends Order{
	int trackingNumber;
	ShippedOrder(int orderId, String orderDate, int trackingNumber){
		super(orderId,orderDate);
		this.trackingNumber = trackingNumber;
	}
	void getOrderStatus() {
		System.out.println("Order Id: "+this.orderId);
		System.out.println("Order Date: "+this.orderDate);
		System.out.println("Tracking Number: "+this.trackingNumber);
		System.out.println("---------------------");
		System.out.println();
	}
}

class DeliveredOrder extends ShippedOrder{
	String deliveryDate;
	DeliveredOrder(int orderId,String orderDate,int trackingNumber,String deliveryDate){
		super(orderId,orderDate,trackingNumber);
		this.deliveryDate = deliveryDate;
	}
	void getOrderStatus() {
		System.out.println("Order Id: "+this.orderId);
		System.out.println("Order Date: "+this.orderDate);
		System.out.println("Tracking Number: "+this.trackingNumber);
		System.out.println("Delivery Date: "+this.deliveryDate);
		System.out.println("---------------------");
		System.out.println();
	}
}

public class OnlineRetailOrderManagement {
	public static void main(String[] args) {
		Order order =new Order(101,"03-01-2026");
		System.out.println("ORDER STATUS");
		order.getOrderStatus();
		System.out.println("Shipped Order Status");
		ShippedOrder shippedOrder = new ShippedOrder(101,"03-01-2026",9112);
		shippedOrder.getOrderStatus();
		DeliveredOrder deliveryOrder = new DeliveredOrder(101,"03-01-2026",9112,"06-01-2026");
		System.out.println("Delivery Order Status");
		deliveryOrder.getOrderStatus();
	}
}
