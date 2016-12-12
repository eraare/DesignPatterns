package com.dp.abstractfactory;

public class MiFactory implements Factory {

	@Override
	public Phone newPhone() {
		// TODO Auto-generated method stub
		return new MiPhone();
	}

	@Override
	public Computer newComputer() {
		// TODO Auto-generated method stub
		return new MiComputer();
	}

}
