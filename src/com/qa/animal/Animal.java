package com.qa.animal;

public abstract class Animal {

	private String name;
	private String type;
	private int weight;
	
	public Animal() {
	}
	
	public Animal(String name, String type, int weight) {
		this.name = name;
		this.type = type;
		this.weight = weight;
	}
	
	public void sleep() {
		System.out.println("zzzz");
	}
	
	public abstract void noise();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

}
