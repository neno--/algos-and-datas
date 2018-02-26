package com.github.nenomm.codility.lesson06;

import java.util.Arrays;

public class MaxProductOfThree {
	// https://app.codility.com/programmers/lessons/6-sorting/max_product_of_three/
	// https://app.codility.com/demo/results/training7XYFVG-HNR/

	public static int solution(int[] A) {
		Arrays.sort(A);
		int leftProd = A[0] * A[1] * A[A.length - 1];
		int rightProd = A[A.length - 3] * A[A.length - 2] * A[A.length - 1];

		return leftProd > rightProd ? leftProd : rightProd;
	}
}
