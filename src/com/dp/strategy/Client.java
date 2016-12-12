package com.dp.strategy;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Travel travel = new Travel();
		travel.travel();
		travel.setVehicle(new Car());
		travel.travel();
	}

}
