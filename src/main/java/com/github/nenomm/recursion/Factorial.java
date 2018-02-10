package com.github.nenomm.recursion;

public class Factorial {
	public static int compute(int i) {
		if ((i == 0) || (i == 1)) {
			return 1;
		}

		return i * compute(i - 1);
	}
}
