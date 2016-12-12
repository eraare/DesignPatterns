package com.dp.adapter;

public class ObjectAdapter implements USB {
	private TypeC typec;
	
	public ObjectAdapter(TypeC typec) {
		// TODO Auto-generated constructor stub
		this.typec = typec;
	}

	@Override
	public void chargeUSB() {
		// TODO Auto-generated method stub
		System.out.println("Charging by USB");
	}

	@Override
	public void chargeTypeC() {
		// TODO Auto-generated method stub
		this.typec.chargeTypeC();
	}

}
