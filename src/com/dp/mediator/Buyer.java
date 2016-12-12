package com.dp.mediator;

public class Buyer extends Person {

	public Buyer(String name, Mediator mediator) {
		super(name, mediator);
		// TODO Auto-generated constructor stub
	}
	
	public void buy(String message) {
		this.getMediator().contact(message, this);
	}
}
