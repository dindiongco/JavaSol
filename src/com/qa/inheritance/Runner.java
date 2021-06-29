package com.qa.inheritance;

public class Runner {

	public static void main(String[] args) {
		
		Animal a = new Animal();
		a.talk();
		
		Dog myDog = new Dog();
		myDog.setName("Growlithe");
		System.out.println(myDog.getName());
		myDog.wagTail();
		System.out.println(myDog.getName());
		myDog.bark();
						
		Cat myCat = new Cat();
		myCat.setAge(2);
		myCat.setName("Meowth");
		System.out.println(myCat.getName() + " is now " + myCat.getAge() + " years old.");
		myCat.purr();
		
		Dog myFrenchPin = new FrenchPin();
		myFrenchPin.wagTail();
		myFrenchPin.bark();
		
	}

}
