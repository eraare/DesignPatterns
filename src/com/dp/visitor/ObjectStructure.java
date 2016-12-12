package com.dp.visitor;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
	private List<Flower> flowers;
	
	public ObjectStructure() {
		flowers = new ArrayList<>();
	}
	
	public void attach(Flower flower) {
		this.flowers.add(flower);
	}
	
	public void detach(Flower flower) {
		this.flowers.remove(flower);
	}
	
	public void accept(Visitor visitor) {
		for(Flower flower : flowers) {
			flower.accept(visitor);
		}
	}
}
