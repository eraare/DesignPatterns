package com.dp.state;

/**
 * 状态模式：允许对象在其内部发生改变时改变其行为，对于对象似乎改变了其类。
 * @author HHH
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TVController controller = new TVController();
		controller.nextChannel();
		controller.powerOn();
		controller.nextChannel();
	}

}
