package com.dp.bridge;

public class SpecialMessage extends Message {
	private Sender sender;
	
	public SpecialMessage() {
		this.sender = new SmsSender();
	}
	
	@Override
	public void send() {
		// TODO Auto-generated method stub
		this.sender.send(this);
	}

}
