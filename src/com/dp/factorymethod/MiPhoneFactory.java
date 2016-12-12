package com.dp.factorymethod;

public class MiPhoneFactory implements PhoneFactory {

	@Override
	public Phone newPhone() {
		// TODO Auto-generated method stub
		return new MiPhone();
	}

}
