package com.dp.composite;

public abstract class Company {
	public String name;

	public Company(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	public abstract void add(Company company);

	public abstract void remove(Company company);

	public abstract void display(int level);
}
