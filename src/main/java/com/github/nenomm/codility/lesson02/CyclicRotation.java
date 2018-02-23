package com.github.nenomm.codility.lesson02;

public class CyclicRotation {
	// score https://app.codility.com/demo/results/trainingK9DJEW-CZ8/
	public static int[] solution(int[] A, int K) {
		int[] result = new int[A.length];

		for (int i = 0; i < A.length; i++) {
			result[(i + K) % A.length] = A[i];
		}

		return result;
	}
}
