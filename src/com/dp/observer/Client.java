package com.dp.observer;

/**
 * 观察者模式：是一种一对多的关系，多个对象监听同一个对象，当被监听者发生变化时，使得监听者可以动态的改变。
 * @author HHH
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Observable magazine = new Magazine();
		
		Observer leo = new User();
		magazine.subscribe(leo);
		
		Observer yan = new User();
		magazine.subscribe(yan);
	
		magazine.notify("最新新闻");
	}

}
