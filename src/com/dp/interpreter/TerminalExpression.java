package com.dp.interpreter;

public class TerminalExpression implements Expression {
	private String data;
	
	public TerminalExpression(String data) {
		// TODO Auto-generated constructor stub
		this.data = data;
	}
	
	@Override
	public boolean interpret(String context) {
		// TODO Auto-generated method stub
		if(context.contains(data)) {
			return true;
		}
		return false;
	}

}
