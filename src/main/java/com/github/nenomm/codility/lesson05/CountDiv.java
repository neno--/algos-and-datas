package com.github.nenomm.codility.lesson05;

public class CountDiv {
	// https://app.codility.com/programmers/lessons/5-prefix_sums/count_div/
	// https://app.codility.com/demo/results/trainingEY6597-E9R/ (Solution verification -- ERROR!)
	public static int solution(int A, int B, int K) {
		int divA = A / K;
		int divB = B / K;

		if (A % K == 0) {
			return divB - divA + 1;
		}
		return divB - divA;
	}
}
