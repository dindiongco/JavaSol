package com.qa.garage;

public class Runner {
	
	public static void main(String[] args) {
		Garage garage = new Garage();
		
		Vehicle v1 = new Car("Mercedes", "Silver");
		
		garage.addVehicle(v1);
		garage.showGarage();
	}
}
