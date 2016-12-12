package com.dp.adapter;

public abstract class InterfaceAdapter implements USB {
	private TypeC typec;
	
	public InterfaceAdapter(TypeC typec) {
		// TODO Auto-generated constructor stub
		this.typec = typec;
	}
	@Override
	public void chargeTypeC() {
		// TODO Auto-generated method stub
		this.typec.chargeTypeC();
	}
}
