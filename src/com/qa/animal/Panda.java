package com.qa.animal;

public class Panda extends Animal implements Walkable {

	public void noise() {
		System.out.println("Squeee squeee");

	}

	public void eat() {
		System.out.println("The panda eats a bamboo stick.");
	}

	@Override
	public void walk() {
		System.out.println("Panda sleeps instead");
	}

}
