package com.dp.mediator;

public class ConcreteMediator implements Mediator {
	@Override
	public void contact(String message, Person person) {
		// TODO Auto-generated method stub
		System.out.println(person.getName() + ": " + message);
	}

}
