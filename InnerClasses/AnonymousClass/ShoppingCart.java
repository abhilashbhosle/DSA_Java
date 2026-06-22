public class ShoppingCart{
	private double totalAmount;

	public ShoppingCart(double totalAmount){
		this.totalAmount=totalAmount;
	}

	public void processPayent(Payment paymentMethod){
		paymentMethod.pay(totalAmount);
	}

}