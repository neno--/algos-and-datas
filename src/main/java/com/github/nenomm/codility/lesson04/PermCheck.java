package com.github.nenomm.codility.lesson04;

public class PermCheck {
	// https://app.codility.com/programmers/lessons/4-counting_elements/perm_check/
	// https://app.codility.com/demo/results/trainingSGZMRX-JVD/
	public static int solution(int[] A) {
		int[] checkTable = new int[A.length];

		for (int i : A) {
			if (i > A.length) {
				return 0;
			}
			checkTable[i - 1] += 1;
		}

		for (int i : checkTable) {
			if (i != 1) {
				return 0;
			}
		}

		return 1;
	}
}
