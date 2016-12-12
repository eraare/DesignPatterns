package com.dp.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元模式：通过共享减少内存中的对象数量
 * @author HHH
 *
 */
public class BikeFactory {
	private static Map<String, Bike> bikes = new HashMap<>();

	public static Bike newBike(String type) {
		Bike bike = bikes.get(type);
		if (bike == null) {
			if (type.equalsIgnoreCase("ofo")) {
				bike = new OfoBike();
			} else if (type.equalsIgnoreCase("mo")) {
				bike = new MoBike();
			}
			bikes.put(type, bike);
		}
		return bike;
	}
}
