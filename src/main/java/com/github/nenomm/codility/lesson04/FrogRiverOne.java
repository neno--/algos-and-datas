package com.github.nenomm.codility.lesson04;

public class FrogRiverOne {
	// https://app.codility.com/programmers/lessons/4-counting_elements/frog_river_one/
	// https://app.codility.com/demo/results/trainingPPHHV6-NXB/

	public static int solution(int X, int[] A) {
		int positions[] = new int[X];
		int steps = 0;

		for (int i = 0; i < A.length; i++) {
			if (positions[A[i] - 1] == 0) {
				positions[A[i] - 1] = 1;
				steps++;
				if (steps == X) {
					return i;
				}
			}
		}

		return -1;
	}
}
