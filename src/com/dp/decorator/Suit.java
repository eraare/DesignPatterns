package com.dp.decorator;

public class Suit implements Clothes {
	private Clothes clothes;
	
	public Suit(Clothes clothes) {
		this.clothes = clothes;
	}

	@Override
	public void wear() {
		// TODO Auto-generated method stub
		this.clothes.wear();
		System.out.println("Wear a coat");
	}
}
