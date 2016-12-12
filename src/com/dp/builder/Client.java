package com.dp.builder;

/**
 * 建造者模式：将一个复杂对象的构建过程和其表示分离，使得同样的构建过程可以适用不同的表示。
 * @author HHH
 *
 */
public class Client {
	public static void main(String[] args) {
		Programmer programmer = new Programmer.Builder()
				.name("Leo")
				.age(25)
				.motto("Victory loves preparation.")
				.build();
		programmer.show();
	}
}
