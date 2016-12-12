package com.dp.abstractfactory;

/**
 * 抽象工厂模式：工厂的工厂，为一系列的产品提供一个统一的创建工厂。
 * @author HHH
 *
 */
public class Client {
	public static void main(String[] args) {
		Factory factory = new MiFactory();
		Phone phone = factory.newPhone();
		Computer computer = factory.newComputer();
		phone.call();
		computer.compute();
	}
}
