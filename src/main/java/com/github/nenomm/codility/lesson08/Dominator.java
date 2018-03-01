package com.github.nenomm.codility.lesson08;

public class Dominator {
	// https://app.codility.com/programmers/lessons/8-leader/dominator/
	// https://app.codility.com/demo/results/trainingP3KXNX-5QC/

	public static int solution(int[] A) {
		int candidate = 0;
		int frequency = 0;

		for (int element : A) {
			if (frequency == 0) {
				candidate = element;
				frequency++;
			} else {
				if (element == candidate) {
					frequency++;
				} else {
					frequency--;
				}
			}
		}

		frequency = 0;
		for (int i = 0; i < A.length; i++) {
			if (A[i] == candidate) {
				frequency++;
				if (frequency > (A.length / 2)) {
					return i;
				}
			}
		}


		return -1;
	}
}
