package com.github.nenomm.codility.lesson09;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MaxProfit {
	// https://app.codility.com/programmers/lessons/9-maximum_slice_problem/max_profit/
	// https://app.codility.com/demo/results/trainingM6R479-SCF/

	private static Logger log = LoggerFactory.getLogger(MaxProfit.class);

	public static int solution(int[] A) {
		int maxDiff = 0;
		int globalMaxDiff = 0;

		for (int i = 1; i < A.length; i++) {
			int diff = A[i] - A[i - 1];

			maxDiff = Integer.max(maxDiff + diff, diff);
			maxDiff = Integer.max(0, maxDiff);
			log.info("{}", maxDiff);

			globalMaxDiff = Integer.max(globalMaxDiff, maxDiff);
		}

		return globalMaxDiff;
	}
}
