package com.dp.proxy;

/**
 * 代理模式：访问控制。
 * @author HHH
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		People people = new Friend();
		people.send();
	}

}
