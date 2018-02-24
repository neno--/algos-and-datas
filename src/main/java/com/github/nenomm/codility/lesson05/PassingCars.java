package com.github.nenomm.codility.lesson05;

public class PassingCars {
	// https://app.codility.com/programmers/lessons/5-prefix_sums/passing_cars/
	// https://app.codility.com/demo/results/trainingVEZPMB-JQA/

	public static int solution(int[] A) {
		int passes = 0;
		int eastCars = 0;
		for (int car : A) {
			if (car == 0) {
				eastCars++;
			} else {
				passes += eastCars;
				if (passes > 1_000_000_000) {
					return -1;
				}
			}
		}

		return passes;
	}
}
