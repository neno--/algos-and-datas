package com.github.nenomm.codility.lesson08;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EquiLeaderTest {
	@Test
	public void test() {
		assertEquals(2, EquiLeader.solution(new int[]{4, 3, 4, 4, 4, 2}));
		assertEquals(0, EquiLeader.solution(new int[]{}));
		assertEquals(2, EquiLeader.solution(new int[]{1, 1, 1}));
	}
}
