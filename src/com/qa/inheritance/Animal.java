package com.qa.inheritance;

public class Animal {
	
	private String name;
	private String species;
	private int age;
	private boolean bipedal;
	
	public Animal() {
				
	}
	
	public Animal(String name, String species, int age, boolean bipedal) {
		this.name = name;
		this.species = species;
		this.age = age;
		this.bipedal = bipedal;
	}
	
	public void talk() {
		System.out.println("BlaH bLAh BlAH");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isBipedal() {
		return bipedal;
	}

	public void setBipedal(boolean bipedal) {
		this.bipedal = bipedal;
	}
	
	
		
}
