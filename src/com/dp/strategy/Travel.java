package com.dp.strategy;

public class Travel {
	private Vehicle vehicle;
	
	public Travel() {
		this.vehicle = new Train();
	}
	
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	public void travel() {
		System.out.print("Travel ");
		vehicle.go();
	}
}
