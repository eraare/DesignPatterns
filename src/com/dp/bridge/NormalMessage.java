package com.dp.bridge;

public class NormalMessage extends Message {
	private Sender sender;
	
	public NormalMessage() {
		this.sender = new SmsSender();
	}
	
	@Override
	public void send() {
		// TODO Auto-generated method stub
		this.sender.send(this);
	}

}
