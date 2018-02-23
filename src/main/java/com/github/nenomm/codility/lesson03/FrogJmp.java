package com.github.nenomm.codility.lesson03;

public class FrogJmp {
	// https://app.codility.com/programmers/lessons/3-time_complexity/frog_jmp/
	// https://app.codility.com/demo/results/trainingPAPZMB-P9Z/
	public static int solution(int X, int Y, int D) {
		int result = (Y - X) / D;

		if ((Y - X) % D == 0) {
			return result;
		} else {
			return result + 1;
		}
	}
}
