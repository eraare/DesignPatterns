package com.dp.decorator;

/**
 * 装饰者模式：动态的添加功能。
 * @author HHH
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clothes clothes = new Suit(new TShirt());
		clothes.wear();
	}

}
