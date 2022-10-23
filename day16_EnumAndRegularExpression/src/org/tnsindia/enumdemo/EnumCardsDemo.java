package org.tnsindia.enumdemo;

public enum EnumCardsDemo implements InterfaceCardsDemo  {
	
	HEART,CLUB,DIAMOND,SPADES;


	public void print() {
		
		System.out.println("Selected shape in the cards:"+this);
	}

}