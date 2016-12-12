package com.dp.observer;

public class User implements Observer {

	@Override
	public void update(Observable observable, String data) {
		// TODO Auto-generated method stub
		System.out.println(data);
	}

}
