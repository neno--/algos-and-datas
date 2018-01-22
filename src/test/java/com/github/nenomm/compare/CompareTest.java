package com.github.nenomm.compare;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.Matchers.contains;
//import static org.junit.Assert.assertArrayEquals;


public class CompareTest {
	List<MyElement> elements;
	List<MyElement> sorted;

	@Before
	public void init() {
		elements = Arrays.asList(new MyElement(10), new MyElement(0), new MyElement(-1), new MyElement(22));
		sorted = Arrays.asList(new MyElement(-1), new MyElement(0), new MyElement(10), new MyElement(22));
	}


	@Test
	public void testComparable() {
		Collections.sort(elements);

		//assertThat(elements, contains(sorted)); not working?
		//assertArrayEquals(sorted, elements); close, but no cigar...

		Assert.assertEquals(sorted, elements);
	}

	@Test
	public void testComparator() {
		Collections.sort(elements, new MyComparator());

		//assertThat(elements, contains(sorted)); not working?
		//assertArrayEquals(sorted, elements); close, but no cigar...

		Assert.assertEquals(sorted, elements);
	}

	@Test
	public void adHocArraySort() {
		int[] elements = {10, 0, -1, 22};
		int[] sorted = {-1, 0, 10, 22};

		Arrays.sort(elements);
		assertArrayEquals(sorted, elements);
	}
}
