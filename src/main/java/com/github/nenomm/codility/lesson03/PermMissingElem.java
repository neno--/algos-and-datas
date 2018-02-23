package com.github.nenomm.codility.lesson03;

public class PermMissingElem {
	// https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/
	// https://app.codility.com/demo/results/trainingRSVUG4-7VK/

	// intermediate results should have been longs instead of ints...
	public static int solution(int[] A) {
		int n = A.length;
		int completeSum = (n + 1) * (n + 2) / 2;
		int partialSum = 0;

		for (int i = 0; i < n; i++) {
			partialSum += A[i];
		}

		return completeSum - partialSum;
	}
}
