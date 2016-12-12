package com.dp.visitor;

public class Bird implements Visitor {

	@Override
	public void visite(Rose rose) {
		// TODO Auto-generated method stub
		System.out.println("Bird visite rose");
	}

	@Override
	public void visite(Lily lily) {
		// TODO Auto-generated method stub
		System.out.println("Bird visite lily");
	}

}
