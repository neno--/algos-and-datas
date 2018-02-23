package com.github.nenomm.codility.lesson02;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class CyclicRotationTest {
	@Test
	public void test() {
		assertArrayEquals(new int[]{}, CyclicRotation.solution(new int[]{}, 17));
		assertArrayEquals(new int[]{1}, CyclicRotation.solution(new int[]{1}, 1));
		assertArrayEquals(new int[]{1}, CyclicRotation.solution(new int[]{1}, 10));
		assertArrayEquals(new int[]{1, 2}, CyclicRotation.solution(new int[]{1, 2}, 0));
		assertArrayEquals(new int[]{2, 1}, CyclicRotation.solution(new int[]{1, 2}, 1));
		assertArrayEquals(new int[]{1, 2}, CyclicRotation.solution(new int[]{1, 2}, 100));
		assertArrayEquals(new int[]{9, 7, 6, 3, 8}, CyclicRotation.solution(new int[]{3, 8, 9, 7, 6}, 3));
	}
}
