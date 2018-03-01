package com.github.nenomm.codility.lesson09;


public class MaxSlice {
	// https://app.codility.com/programmers/lessons/9-maximum_slice_problem/max_slice_sum/
	// https://app.codility.com/demo/results/trainingPN96GD-VDW/ copied from https://rafal.io/posts/codility-max-slice-sum.html

	public static int solution(int[] A) {
		int maxSum = A[0];
		int currentSum = maxSum;

		for (int i = 1; i < A.length; i++) {
			currentSum = Integer.max(A[i], currentSum + A[i]);
			if (currentSum > maxSum) {
				maxSum = currentSum;
			}
		}

		return maxSum;
	}
}
