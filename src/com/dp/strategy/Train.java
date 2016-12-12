package com.dp.strategy;

/**
 * 策略模式：定义一系列的算法，并把这些算法封装起来，使它们可以相互替换。
 * @author HHH
 *
 */
public class Train implements Vehicle {

	@Override
	public void go() {
		// TODO Auto-generated method stub
		System.out.println("by Train");
	}

}
