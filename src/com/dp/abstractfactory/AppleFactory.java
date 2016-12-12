package com.dp.abstractfactory;

public class AppleFactory implements Factory {

	@Override
	public Phone newPhone() {
		// TODO Auto-generated method stub
		return new ApplePhone();
	}

	@Override
	public Computer newComputer() {
		// TODO Auto-generated method stub
		return new AppleComputer();
	}

}
