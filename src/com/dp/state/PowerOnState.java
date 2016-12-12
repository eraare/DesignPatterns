package com.dp.state;

public class PowerOnState implements TVState {

	@Override
	public void prevChannel() {
		// TODO Auto-generated method stub
		System.out.println("previous channel");
	}

	@Override
	public void nextChannel() {
		// TODO Auto-generated method stub
		System.out.println("next channel");
	}

	@Override
	public void turnUp() {
		// TODO Auto-generated method stub
		System.out.println("turn up");
	}

	@Override
	public void turnDown() {
		// TODO Auto-generated method stub
		System.out.println("turn down");
	}

}
