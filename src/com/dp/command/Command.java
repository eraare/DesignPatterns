package com.dp.command;

public class Command {
	private Receiver receiver;
	
	public Command(Receiver receiver) {
		this.receiver = receiver;
	}
	
	public void execute() {
		this.receiver.action();
	}
}
