package com.qa.garage;

public class Truck extends Vehicle {

	private String plateNo;
	private String loadType;
	
	public Truck() {
		
	}

	public Truck(String plateNo, String loadType) {
		this.setType("Truck");
		this.plateNo = plateNo;
		this.loadType = loadType;
	}

	public String getLoadType() {
		return loadType;
	}

	public void setLoadType(String loadType) {
		this.loadType = loadType;
	}

	public String getPlateNo() {
		return plateNo;
	}

	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}

}
