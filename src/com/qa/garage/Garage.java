package com.qa.garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	
	private List<Vehicle> vehicles;
	
	public Garage() {
		this.vehicles = new ArrayList<>();
	}
	
	public void showGarage() {
		for (Vehicle v: vehicles) {
			System.out.println(v.getFixBill());
		}
	}
	
	public void addVehicle(Vehicle vehicle) {
		this.vehicles.add(vehicle);
	}
	
	public void removeVehicle(int index) {
		this.vehicles.remove(index);
	}
	
	public void removeVehicle(Vehicle type) {
		this.vehicles.remove(type);
	}
	
	public void emptyGarage() {
		this.vehicles.removeAll(vehicles);
	}
	
	public void fixVehicle() {
		
	}

}
