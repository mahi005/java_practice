package com.runtime.polymorphism;

class Card{
	void swipe() {
		System.out.println("1 card");
	}
}

class CrediteCard extends Card{
	void swipe() {
		System.out.println("2nd card");
	}
}

class DebitCard extends Card{
	void swipe() {
		
	}
}

class Shop{
	static void cardpayment(Card ref) {
		if(ref!=null) {
			ref.swipe();
		}
	}
}

public class Mainclass2 {
public static void main(String[] args) {
	Card ref;
	
	ref = new  DebitCard();
	ref.swipe();
	
	ref=new CrediteCard();
	ref.swipe();
	
	Shop.cardpayment(new CrediteCard());
	Shop.cardpayment(new DebitCard());
}
}
