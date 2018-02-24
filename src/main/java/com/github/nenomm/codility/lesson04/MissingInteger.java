package com.github.nenomm.codility.lesson04;

import java.util.HashSet;
import java.util.Set;

public class MissingInteger {
	// https://app.codility.com/programmers/lessons/4-counting_elements/missing_integer/
	// https://app.codility.com/demo/results/trainingPMM8EZ-ED9/
	public static int solution(int[] A) {
		int max = A[0], i;
		Set<Integer> positiveElements = new HashSet<Integer>(A.length);

		for (int e : A) {
			if (e > 0) {
				positiveElements.add(e);
			}
			if (e > max) {
				max = e;
			}
		}

		if (max < 1) {
			return 1;
		}

		for (i = 0; i < max; i++) {
			if (!positiveElements.contains(i + 1)) {
				return i + 1;
			}
		}

		return i + 1;
	}
}
