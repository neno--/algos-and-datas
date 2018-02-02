package com.github.nenomm.immutable;

import com.google.common.collect.ImmutableList;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ImmutableTest {
	private List<Integer> sourceList = new ArrayList<>(Arrays.asList(1, 2, 3, 4));

	@Test(expected = UnsupportedOperationException.class)
	public void testException() {
		List<Integer> list = ImmutableList.copyOf(sourceList);
		list.add(10);
	}

	@Test
	public void testAddToSource() {
		List<Integer> list = ImmutableList.copyOf(sourceList);
		assertEquals(4, list.size());
		sourceList.add(100);
		assertEquals(4, list.size());
	}
}
