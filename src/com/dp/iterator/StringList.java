package com.dp.iterator;

public class StringList implements Container {
	private String[] strings;
	private int size;

	public StringList() {
		// TODO Auto-generated constructor stub
		strings = new String[10];
		size = 0;
	}

	public void put(String string) {
		strings[size++] = string;
	}

	public String get(int index) {
		return strings[index];
	}

	public class StringIterator implements Iterator {
		private int index;

		public StringIterator() {
			// TODO Auto-generated constructor stub
			this.index = 0;
		}

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return index < size;
		}

		@Override
		public Object next() {
			// TODO Auto-generated method stub
			return strings[index++];
		}

	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new StringIterator();
	}
}
