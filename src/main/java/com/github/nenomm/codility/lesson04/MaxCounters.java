package com.github.nenomm.codility.lesson04;

public class MaxCounters {
	// https://app.codility.com/programmers/lessons/4-counting_elements/max_counters/
	// https://app.codility.com/demo/results/trainingPG56JG-XD2/

	public static int[] solution(int N, int[] A) {
		int[] result = new int[N];
		int[] tracking = new int[N];
		int[] maxElementForVersion = new int[N];
		int maxElement = 0;
		int version = 0;

		for (int operation : A) {
			if (operation <= N) {
				int index = operation - 1;
				if (tracking[index] != version) {
					tracking[index] = version;
					result[index] = maxElementForVersion[version - 1];
				}
				result[index]++;
				if (result[index] > maxElement) {
					maxElement = result[index];
				}
			} else {
				maxElementForVersion[version] = maxElement;
				version++;
			}
		}

		for (int i = 0; i < N; i++) {
			if (tracking[i] != version) {
				result[i] = maxElementForVersion[version - 1];
			}
		}

		return result;
	}
}
