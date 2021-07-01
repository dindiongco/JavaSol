package com.qa.garage;

public class Motorbike extends Vehicle {

	private String plateNo;
	private String colour;
	
	public Motorbike() {
		
	}

	public Motorbike(String plateNo, String colour) {
		this.setType("Motorbike");
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
