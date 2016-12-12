package com.dp.flyweight;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike ofo = BikeFactory.newBike("ofo");
		Bike mo = BikeFactory.newBike("mo");
		Bike o = BikeFactory.newBike("ofo");
		Bike m = BikeFactory.newBike("mo");
		ofo.ride();
		mo.ride();
		o.ride();
		m.ride();
	}

}
