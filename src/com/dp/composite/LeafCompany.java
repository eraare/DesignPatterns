package com.dp.composite;

public class LeafCompany extends Company {
	public LeafCompany(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}

	@Override
	public void add(Company company) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Company company) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display(int level) {
		// TODO Auto-generated method stub
		for(int i = 0; i < level * 2; i++) {
			System.out.print("-");
		}
		System.out.println(this.name);
	}
}
