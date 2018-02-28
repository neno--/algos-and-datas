package com.github.nenomm.codility.lesson08;

import java.util.HashMap;
import java.util.Map;

public class EquiLeader {
	// https://app.codility.com/programmers/lessons/8-leader/equi_leader/
	// https://app.codility.com/demo/results/training59J6YE-XSM/ 33% (bug on line 35)
	// https://app.codility.com/demo/results/trainingSY22VX-D4N/ 66% (correct, but slow)

	public static int solution(int[] A) {
		if (A.length < 2) {
			return 0;
		}

		Map<Integer, Integer> freqs = new HashMap<Integer, Integer>();
		Map<Integer, Integer> currentFreqs = new HashMap<Integer, Integer>();
		int mostFrequent = A[0];
		int numberOfEquiLeaders = 0;

		for (int i : A) {
			increment(i, freqs);
		}

		for (int i = 0; i < (A.length - 1); i++) {
			increment(A[i], currentFreqs);

			if (currentFreqs.get(mostFrequent) < currentFreqs.get(A[i])) {
				mostFrequent = A[i];
			}

			boolean leftLeader = false;

			if (i != 1) {
				leftLeader = currentFreqs.get(mostFrequent) > ((i + 1) / 2);
			} else {
				leftLeader = currentFreqs.get(mostFrequent) == 2;
			}

			if (leftLeader) {
				if ((A.length - i + 1) != 1) {
					if (((freqs.get(mostFrequent) - currentFreqs.get(mostFrequent)) > ((A.length - (i + 1)) / 2))) {
						numberOfEquiLeaders++;
					}
				} else {
					if (freqs.get(mostFrequent) - currentFreqs.get(mostFrequent) == 2) {
						numberOfEquiLeaders++;
					}
				}
			}
		}

		return numberOfEquiLeaders;
	}

	private static void increment(int i, Map<Integer, Integer> map) {
		Integer num = map.get(i);
		if (num == null) {
			num = 1;
		} else {
			num++;
		}
		map.put(i, num);
	}
}
