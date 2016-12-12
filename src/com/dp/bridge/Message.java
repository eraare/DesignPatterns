package com.dp.bridge;

public abstract class Message {
	public String from;
	public String content;
	public String to;
	
	public abstract void send();
}
