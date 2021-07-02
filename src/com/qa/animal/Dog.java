package com.qa.animal;

public class Dog extends Animal implements Walkable, Jumpable{
	
	public void bark() {
		System.out.println("Woof woof");
	}

	@Override
	public void jumps() {
		System.out.println("Doggo leaps for the ball");
	}

	@Override
	public void walk() {
		System.out.println("Doggo follows owner happily");
	}

}
