package com.dp.memento;

public class Game {
	private State state;
	private Memento memento;
	
	public Game(State state) {
		// TODO Auto-generated constructor stub
		this.state = state;
	}
	
	public Memento createMemento() {
		return new GameMemento(state);
	}
	
	public void play() {
		state.name = " ß∞‹";
		state.info = "¥Úboss ß∞‹";
	}
	
	public void show() {
		System.out.println(state.name + ": " + state.info);
	}
	
	public void restore(Memento memento) {
		this.state = memento.getState();
	}
}
