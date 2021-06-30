package com.qa.garage;

public class Vehicle {

	private String plateNo;
	private String type;
	private String brand;

	public Vehicle() {

	}

	public Vehicle(String plateNo, String type, String brand) {
		this.plateNo = plateNo;
		this.type = type;
		this.brand = brand;
	}

	public String getPlateNo() {
		return plateNo;
	}

	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
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

}
