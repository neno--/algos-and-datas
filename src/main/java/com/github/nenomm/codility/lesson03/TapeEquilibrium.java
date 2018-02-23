package com.github.nenomm.codility.lesson03;

import static java.lang.Math.abs;

public class TapeEquilibrium {
	//https://app.codility.com/demo/results/training2QKNZE-A5V/
	public static int solution(int[] A) {
		int length = A.length;
		int leftSums[] = new int[length];
		int rightSums[] = new int[length];
		int minDiff = Integer.MAX_VALUE;

		leftSums[0] = A[0];
		rightSums[length - 1] = A[length - 1];

		for (int i = 1; i < length; i++) {
			leftSums[i] = leftSums[i - 1] + A[i];
			rightSums[length - 1 - i] = rightSums[length - i] + A[length - 1 - i];
		}

		for (int i = 1; i < length; i++) {
			if (minDiff > abs(leftSums[i - 1] - rightSums[i])) {
				minDiff = abs(leftSums[i - 1] - rightSums[i]);
			}
		}

		return minDiff;
	}
}
