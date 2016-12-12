package com.dp.bridge;

/**
 * 桥接模式：将抽象部分与实现部分分离，使抽象和实现均可独立的变化。
 * @author Leo
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Message message = new NormalMessage();
		message.from = "Leo";
		message.content = "I love you.";
		message.to = "Yan";
		message.send();
	}

}
