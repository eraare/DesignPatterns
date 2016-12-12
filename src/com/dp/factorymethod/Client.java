package com.dp.factorymethod;

/**
 * 工厂方法模式：对象的工厂，为实现同一接口的类提供统一的创建工厂，使类的实例化延迟到子类进行。
 * @author HHH
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PhoneFactory factory = new MiPhoneFactory();
		Phone phone = factory.newPhone();
		phone.call();
	}

}
