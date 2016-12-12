package com.dp.facade;

/**
 * 外观模式：为子系统的一系列接口提供一个一致的外观，定义一个高层接口，这个接口使得子系统更加容易使用。
 * @author Leo
 *
 */
public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer computer = new Computer();
		computer.powerOn();
		computer.powerOff();
	}

}
