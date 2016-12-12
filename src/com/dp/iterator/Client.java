package com.dp.iterator;

/**
 * 迭代器模式：提供一种方法顺序访问聚合对象中的各元素，而又不暴露该对象的内部实现。
 * @author HHH
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringList names = new StringList();
		names.put("Leo");
		names.put("yan");
		names.put("Lily");
		Iterator iterator = names.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
