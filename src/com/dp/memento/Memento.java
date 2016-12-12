package com.dp.memento;

public abstract class Memento {
	private State state;
	
	public Memento(State state) {
		this.state = state.clone();
	}
	
	public void setState(State state) {
		this.state = state;
	}
	
	public State getState() {
		return state;
	}
}
