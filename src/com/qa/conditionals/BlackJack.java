package com.qa.conditionals;

public class BlackJack {

	public static void main(String[] args) {
		play(2, 22);
		play(10, 20);
		play(21, 20);
		play(24, 1);
		play(22, 23);
		play(23, 22);
	}
	
	public static void play(int card1, int card2) {
		
				
		if (card1 <= 21 && card1 > card2) {
			System.out.println(card1);
		}
		
		else if (card1 < card2 && card2 > 21 && card1 <21) {
			System.out.println(card1);
		}
		else if (card2 <= 21) {
			System.out.println(card2);
		}
		else {
			System.out.println(0);
		}
		
	}

}
