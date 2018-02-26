package com.github.nenomm.codility.lesson06;

import java.util.HashSet;
import java.util.Set;

public class Distinct {
	// https://app.codility.com/programmers/lessons/6-sorting/distinct/
	// https://app.codility.com/demo/results/trainingCGWR48-N5Q/

	public static int solution(int[] A) {
		Set<Integer> distinctElements = new HashSet<Integer>(A.length);

		for (int i : A) {
			distinctElements.add(i);
		}

		return distinctElements.size();
	}
}
