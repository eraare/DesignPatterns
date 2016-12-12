package com.dp.mediator;

public abstract class Person {
	private String name;
	private Mediator mediator;
	
	public Person(String name, Mediator mediator) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.mediator = mediator;
	}
	
	public String getName() {
		return this.name;
	}
	
	public Mediator getMediator() {
		return this.mediator;
	}
}
