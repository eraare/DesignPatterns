package com.dp.memento;

/**
 * 备忘录模式:在不破坏封装性的前提下，捕获一个对象的内部状态，并在该对象之外保存这个状态，这样以后就可将该对象恢复到之前保存的状态。
 * @author HHH
 *
 */
public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Game game = new Game(new State("打Boss", "一起去打Boss"));
		
		Memento memento = game.createMemento();
		Caretaker ct = new Caretaker();
		ct.setMemento(memento);
		
		game.play();
		game.show();
		
		game.restore(ct.getMemento());
		game.show();
	}

}
