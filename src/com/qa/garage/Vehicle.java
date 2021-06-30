package com.qa.garage;

public class Vehicle {

	private String type;
	private String brand;

	public Vehicle() {

	}

	public Vehicle(String type, String brand) {
		this.type = type;
		this.setBrand(brand);
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int fixBill() {
		if (this.type == "Car") {
			return 1000;
		}
		if (this.type == "Motorbike") {
			return 100;
		}
		if (this.type == "Truck") {
			return 10000;
		}
		return 0;
	}

}
