package com.dp.bridge;

public class SmsSender implements Sender {

	@Override
	public void send(Message message) {
		// TODO Auto-generated method stub
		System.out.println("Send by Sms");
		System.out.println(message.from + " " + message.content + " " + message.to);
	}

}
