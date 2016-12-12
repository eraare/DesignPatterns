package com.dp.visitor;

public class Bee implements Visitor {

	@Override
	public void visite(Rose rose) {
		// TODO Auto-generated method stub
		System.out.println("Bee visite rose");
	}

	@Override
	public void visite(Lily lily) {
		// TODO Auto-generated method stub
		System.out.println("Bee visite lily");
	}

}
