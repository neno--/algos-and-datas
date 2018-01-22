package com.github.nenomm.compare;

import java.util.Comparator;

public class MyComparator implements Comparator<MyElement>{

	@Override
	public int compare(MyElement o1, MyElement o2) {
		return o1.getI() - o2.getI();
	}
}
