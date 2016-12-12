package com.dp.proxy;

public class Friend implements People {

	private People people;

	public Friend() {
		// TODO Auto-generated constructor stub
		this.people = new You();
	}

	@Override
	public void send() {
		// TODO Auto-generated method stub
		this.people.send();
	}

}
