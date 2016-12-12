package com.dp.prototype;

public class Document implements Cloneable {
	private String text;

	public Document(String text) {
		this.text = text;
	}
	
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Document document = (Document) super.clone();
		document.text = this.text;
		return document;
	}

	public void show() {
		System.out.println(text);
	}
}
