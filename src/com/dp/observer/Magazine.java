package com.dp.observer;

import java.util.ArrayList;
import java.util.List;

public class Magazine implements Observable {
	private List<Observer> observers;

	public Magazine() {
		this.observers = new ArrayList<>();
	}

	@Override
	public void subscribe(Observer observer) {
		// TODO Auto-generated method stub
		this.observers.add(observer);
	}

	@Override
	public void unsubscribe(Observer observer) {
		// TODO Auto-generated method stub
		this.observers.remove(observer);
	}

	@Override
	public void notify(String data) {
		// TODO Auto-generated method stub
		for (Observer observer : observers) {
			observer.update(this, data);
		}
	}

}
