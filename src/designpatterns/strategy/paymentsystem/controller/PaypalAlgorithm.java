package designpatterns.strategy.paymentsystem.controller;

public class PaypalAlgorithm implements Payment {
	private String email;
	private String password;

	
	public PaypalAlgorithm(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}


	@Override
	public void pay(int amount) {
		// TODO Auto-generated method stub
		System.out.println(amount + " paid with Paypal");
	}
	
	

}
