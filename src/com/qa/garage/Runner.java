package com.qa.garage;

public class Runner {
	
	private static Garage garage;
	
	public static void main(String[] args) {
		
		Car c1 = new Car("ADSS 2OE", "Blue");
		
		garage.addVehicle(c1);
		
	}
	
}
