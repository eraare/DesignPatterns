package com.dp.composite;

/**
 * 组合模式：把对象组合成树形结构以表示部分和整体的层级结构。
 * @author HHH
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Company root = new BranchCompany("国华集团");
		
		Company alibaba = new BranchCompany("阿里巴巴");
		Company aHR = new LeafCompany("阿里人事部");
		Company aFinacial = new LeafCompany("阿里财务部");
		alibaba.add(aHR);
		alibaba.add(aFinacial);
		
		Company tecent = new BranchCompany("腾讯");
		Company tHR = new LeafCompany("腾讯人事部");
		Company tFinacial = new LeafCompany("腾讯财务部");
		tecent.add(tHR);
		tecent.add(tFinacial);
		
		root.add(alibaba);
		root.add(tecent);
		
		root.display(1);
	}

}
