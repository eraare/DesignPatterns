package com.dp.prototype;

/**
 * 原型模式：通过克隆为一个对象创造一个副本。
 * @author HHH
 *
 */
public class Client {
	public static void main(String[] args) throws CloneNotSupportedException {
		Document document = new Document("I love you.");
		Document copy = (Document) document.clone();
		copy.show();
		copy.setText("I Love You.");
		document.show();
	}
}
