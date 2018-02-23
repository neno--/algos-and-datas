package com.github.nenomm.codility.lesson02;

public class OddOccurrencesInArray {
	// score https://app.codility.com/demo/results/trainingB6SZWJ-KGD/

	public static int solution(int[] A) {
		int[] lookup = new int[1_000_000];

		for (int element : A) {
			lookup[element] += 1;
		}

		for (int i = 0; i < lookup.length; i++) {
			if ((lookup[i] % 2) == 1) {
				return i;
			}
		}

		return -1;
	}
}
