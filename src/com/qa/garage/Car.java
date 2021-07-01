package com.qa.garage;

public class Car extends Vehicle {

	private String plateNo;
	private String colour;

	public Car() {
	}

	public Car(String plateNo, String colour) {
		this.setType("Car");
		this.plateNo = plateNo;
		this.colour = colour;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getPlateNo() {
		return plateNo;
	}

	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

}
