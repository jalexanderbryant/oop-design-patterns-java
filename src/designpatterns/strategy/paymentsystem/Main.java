package designpatterns.strategy.paymentsystem;

import designpatterns.strategy.paymentsystem.controller.CreditCardAlgorithm;
import designpatterns.strategy.paymentsystem.controller.PaypalAlgorithm;
import designpatterns.strategy.paymentsystem.controller.ShoppingCart;
import designpatterns.strategy.paymentsystem.model.Product;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShoppingCart cart = new ShoppingCart();
		Product pants = new Product("234", 25);
		Product shirt = new Product("987", 15);
		
		cart.addProduct(pants);
		cart.addProduct(shirt);
		
		cart.pay(new PaypalAlgorithm("test@gmail.com", "nowayman"));
		cart.pay(new CreditCardAlgorithm("James","1244538484"));
		
		
	}

}
