package com.dp.state;

public class TVController implements TVState {
	private TVState state;
	
	public TVController() {
		// TODO Auto-generated constructor stub
		state = new PowerOffState();
	}
	
	public void powerOn() {
		state = new PowerOnState();
	}
	
	public void powerOff() {
		state = new PowerOffState();
	}
	
	@Override
	public void prevChannel() {
		// TODO Auto-generated method stub
		this.state.prevChannel();
	}

	@Override
	public void nextChannel() {
		// TODO Auto-generated method stub
		this.state.nextChannel();
	}

	@Override
	public void turnUp() {
		// TODO Auto-generated method stub
		this.state.turnUp();
	}

	@Override
	public void turnDown() {
		// TODO Auto-generated method stub
		this.state.turnDown();
	}

}
