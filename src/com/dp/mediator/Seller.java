package com.dp.mediator;

public class Seller extends Person {

	public Seller(String name, Mediator mediator) {
		super(name, mediator);
		// TODO Auto-generated constructor stub
	}
	
	public void sell(String message) {
		this.getMediator().contact(message, this);
	}

}
