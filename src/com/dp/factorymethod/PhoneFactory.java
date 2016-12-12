package com.dp.factorymethod;

public interface PhoneFactory {
	/*
	 * public static Phone newPhone(String type) { if
	 * (type.equalsIgnoreCase("Mi")) { return new MiPhone(); } else if
	 * (type.equalsIgnoreCase("Apple")) { return new ApplePhone(); }
	 * 
	 * return null; }
	 * 
	 * public static Phone newMiPhone() { return new MiPhone(); }
	 * 
	 * public static Phone newApplePhone() { return new ApplePhone(); }
	 */
	public Phone newPhone();
}
