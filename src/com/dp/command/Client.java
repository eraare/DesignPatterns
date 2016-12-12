package com.dp.command;

/**
 * 命令模式：将请求封装成对象，以便使用不同的请求，日志，队列等来参数化其他对象。命令模式支持撤销操作。
 * @author HHH
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Request request = new Request(new Command(new Receiver()));
		request.request();
	}

}
