package com.qa.inheritance;

public class Dog extends Animal {
	
	public Dog() {
		this("Vulpix", 3, false);
	}
	
	public Dog(String name, int age, boolean bipedal) {
		super(name, "DOG", age, bipedal);
	}
	
	public void wagTail() {
		System.out.println("Wags tail");
	}
	
	public void bark() {
		System.out.println("Woof woof");
	}
	
}
