package com.qa.qacommunity;

public class Coins {

	public static void main(String[] args) {
		cost(10);
		payment(20);
	}
		
	public static double cost(double price) {
		return price;
	}
	
	public static double payment(double amount) {
		
		return amount - cost(0);
		
	}
}
