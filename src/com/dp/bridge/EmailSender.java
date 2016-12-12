package com.dp.bridge;

public class EmailSender implements Sender {

	@Override
	public void send(Message message) {
		// TODO Auto-generated method stub
		System.out.println("Send by Email");
		System.out.println(message.from + " " + message.content + " " + message.to);
	}

}
