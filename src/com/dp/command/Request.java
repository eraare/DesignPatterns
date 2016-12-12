package com.dp.command;

public class Request {
	private Command command;
	
	public Request(Command command) {
		this.command = command;
	}
	
	public void request() {
		this.command.execute();
	}
}
