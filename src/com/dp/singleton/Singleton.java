package com.dp.singleton;

public class Singleton {
	private Singleton() {
	}

	private volatile static Singleton singleton = null;

	public static Singleton getInstance() {
		if (singleton == null) {
			synchronized (Singleton.class) {
				if (singleton == null) {
					singleton = new Singleton();
				}
			}
		}
		return singleton;
	}

	public String text;

	public void show() {
		System.out.println(text);
	}
}
