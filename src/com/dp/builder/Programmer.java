package com.dp.builder;

public class Programmer {
	private String name;
	private int age;
	private String motto;

	public Programmer(Builder builder) {
		this.name = builder.name;
		this.age = builder.age;
		this.motto = builder.motto;
	}
	
	public void show() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(motto);
	}

	public static class Builder {
		private String name;
		private int age;
		private String motto;

		public Builder() {

		}

		public Builder name(String name) {
			this.name = name;
			return this;
		}

		public Builder age(int age) {
			this.age = age;
			return this;
		}

		public Builder motto(String motto) {
			this.motto = motto;
			return this;
		}

		public Programmer build() {
			return new Programmer(this);
		}
	}
}
