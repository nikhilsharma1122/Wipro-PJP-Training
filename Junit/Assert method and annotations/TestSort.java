package com.Junit;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestSortTest {

	@Test
	public void test() {
		int[] expected = {1,2,3,4,5};
		int[] actual = {1,2,3,4,5};
		Assert.assertArrayEquals(expected, actual);
			}

}
