package com.dp.visitor;

/**
 * 访问者模式：表示一个作用于某对象结构中各元素的操作，它使你在不改变各元素类的前提下定义作用于这些元素的新操作。
 * @author HHH
 *
 */
public class Client {
	public static void main(String[] args) {
		ObjectStructure flowers = new ObjectStructure();
		flowers.attach(new Rose());
		flowers.attach(new Lily());
		flowers.accept(new Bee());
	}
}
