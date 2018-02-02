package com.github.nenomm.immutable;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class UnmodifiableTest {
	private List<Integer> sourceList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

	@Test(expected = UnsupportedOperationException.class)
	public void testException() {
		List<Integer> list = Collections.unmodifiableList(sourceList);
		list.add(10);
	}

	@Test
	public void testAddToSource() {
		List<Integer> list = Collections.unmodifiableList(sourceList);
		assertEquals(4, list.size());
		sourceList.add(100);
		assertEquals(5, list.size());
	}
}
