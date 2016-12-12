package com.dp.composite;

import java.util.ArrayList;
import java.util.List;

public class BranchCompany extends Company {
	private List<Company> companys;

	public BranchCompany(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		this.companys = new ArrayList<>();
	}

	@Override
	public void add(Company company) {
		// TODO Auto-generated method stub
		this.companys.add(company);
	}

	@Override
	public void remove(Company company) {
		// TODO Auto-generated method stub
		this.companys.remove(company);
	}

	@Override
	public void display(int level) {
		// TODO Auto-generated method stub
		for (int i = 0; i < level * 2; i++) {
			System.out.print("-");
		}
		System.out.println(this.name);
		level++;
		for (Company company : companys) {
			company.display(level);
		}
	}

}
