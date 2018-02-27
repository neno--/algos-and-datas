package com.github.nenomm.codility.lesson07;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StoneWallTest {
	@Test
	public void test() {
		assertEquals(7, StoneWall.solution(new int[]{8, 8, 5, 7, 9, 8, 7, 4, 8}));
	}
}
