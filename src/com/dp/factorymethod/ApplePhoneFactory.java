package com.dp.factorymethod;

public class ApplePhoneFactory implements PhoneFactory {

	@Override
	public Phone newPhone() {
		// TODO Auto-generated method stub
		return new ApplePhone();
	}

}
