package com.dp.singleton;

/**
 * 单例模式：确保系统中只有类的一个实例。
 * @author HHH
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton.getInstance().text = "单例模式";
		Singleton.getInstance().show();
	}

}