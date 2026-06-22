public class Test{
	public static void main(String[] args) {
		ShoppingCart cart=new ShoppingCart(100.0);
		// CreditCard creditCard=new CreditCard(); 
		// cart.processPayent(creditCard);
		// anonymous class implementing Payment interface
		cart.processPayent(new Payment(){
			@Override
			public void pay(double amount){
				System.out.println("Paid " + amount + " using Credit Card");
			}
		});
	}
}