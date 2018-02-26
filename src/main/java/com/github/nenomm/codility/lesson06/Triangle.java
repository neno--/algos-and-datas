package com.github.nenomm.codility.lesson06;

import java.util.Arrays;

public class Triangle {
	// https://app.codility.com/programmers/lessons/6-sorting/triangle/
	// https://app.codility.com/demo/results/trainingUQF8R7-ND3/

	public static int solution(int[] A) {
		long a, b, c;

		Arrays.sort(A);

		for (int i = 0; i < A.length; i++) {
			if ((i + 2) >= A.length) {
				return 0;
			}

			a = A[i];
			b = A[i + 1];
			c = A[i + 2];

			if ((a + b) > c) {
				return 1;
			}
		}

		return 0;
	}
}
