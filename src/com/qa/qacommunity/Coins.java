package com.qa.qacommunity;

public class Coins {

	public static void main(String[] args) {
		
		
	}
	
	public static void coins(double payment, double price) {
		
		price = price * 100;
		payment = payment * 100;
		
		double change = payment - price;
		
		System.out.println("Your payment is" + price / 100 + "and your change is" + change / 100 + ". \n Thank you for shopping at Tesco. Goodbye!");
		
		
		 
	}
}
