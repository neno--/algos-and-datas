package com.github.nenomm.compare;

// this makes no sense
public class MyComparable implements Comparable<MyElement> {

	@Override
	public int compareTo(MyElement o) {
		return 0;
	}
}
