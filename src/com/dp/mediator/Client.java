package com.dp.mediator;

/**
 * 中介者模式：用一个中介者对象来封装一系列的对象交互，中介者使得个对象之间不需要显示的相互引用，从而使其松散耦合，而且可以独立的改变他们之间的交互。
 * @author HHH
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mediator mediator = new ConcreteMediator();
		Buyer buyer = new Buyer("Leo", mediator);
		Seller seller = new Seller("Yan", mediator);
		seller.sell("我有房子出租");
		buyer.buy("我要租房子，一辈子");
	}

}
