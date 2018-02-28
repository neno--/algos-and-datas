package com.github.nenomm.codility.lesson07;

public class Nesting {
	// https://app.codility.com/programmers/lessons/7-stacks_and_queues/nesting/
	// https://app.codility.com/demo/results/training23TDZH-FTJ/

	public static int solution(String S) {
		int parens = 0;

		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == '(') {
				parens++;
				if (parens > (S.length() - (i + 1))) {
					return 0;
				}
			} else {
				parens--;
			}
			if (parens < 0) {
				return 0;
			}
		}

		return parens > 0 ? 0 : 1;
	}
}
