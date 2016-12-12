package com.dp.memento;

public class State implements Cloneable {
	public String name;
	public String info;
	
	public State(String name, String info) {
		this.name = name;
		this.info = info;
	}
	
	@Override
	protected State clone() {
		// TODO Auto-generated method stub
		State state = null;
		try {
			state = (State) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		state.name = this.name;
		state.info = this.info;
		return state;
	}
}
