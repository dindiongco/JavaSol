package com.qa.inheritance;

public class FrenchPin extends Dog {
	
	public FrenchPin() {
		this.setSpecies("Dog");
		this.setName("John the French Pin");
	}
	
	@Override
	public void wagTail() {
		System.out.println("My French Pin wags tail");
	}
	
	@Override
	public void bark() {
		System.out.println("Grrrrrrr");
	}
	
}
