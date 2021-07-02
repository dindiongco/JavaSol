package com.qa.animal;

public class Dolphin extends Animal implements Jumpable {
	
	public void whistle() {
		System.out.println("Eee EEE eee");
	}

	@Override
	public void jumps() {
		
		System.out.println("Splash splash");
		
	}

}
