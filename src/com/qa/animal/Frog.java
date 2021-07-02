package com.qa.animal;

public class Frog extends Animal implements Jumpable, Walkable{
	
	public void noise() {
		System.out.println("Ribbit ribbit");
	}

	@Override
	public void walk() {
		System.out.println("Tok tok tok");
		
	}

	@Override
	public void jumps() {
		System.out.println("Whoosh");
		
	}

}
