package com.github.nenomm.compare;

public class MyElement implements Comparable<MyElement> {
	private int i;

	public MyElement(int i) {
		this.i = i;
	}

	public int getI() {
		return i;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		MyElement myElement = (MyElement) o;

		return i == myElement.i;
	}

	@Override
	public int hashCode() {
		return i;
	}

	@Override
	public int compareTo(MyElement o) {
		return i - o.getI();
	}
}
