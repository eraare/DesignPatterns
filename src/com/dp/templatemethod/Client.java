package com.dp.templatemethod;

/**
 * 模板方法模式：定义一个算法的骨架，让一些步骤延迟到子类进行。
 * @author HHH
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Template template = new SimpleTemplate();
		template.show();
	}

}
