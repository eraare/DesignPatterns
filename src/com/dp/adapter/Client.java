package com.dp.adapter;

/**
 * 适配器模式：将一个几口转换成客户需要的接口，处理由于接口不同导致的类的兼容性问题。
 * @author HHH
 *
 */
public class Client {
	public static void main(String[] args) {
		USB usb = new ClassAdapter();
		usb.chargeTypeC();
		usb.chargeUSB();
	}
}
