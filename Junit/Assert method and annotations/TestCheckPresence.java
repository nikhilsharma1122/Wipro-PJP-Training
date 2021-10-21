package com.Junit;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestCheckPresence {

	@Test
	public void test() {
		int[] arr = {1,2,3,4,5};
		//Assert.assertArrayEquals(expected, actual);
		Assert.assertTrue(arr[1] == 2);
		Assert.assertFalse(arr[1] == 3);
	}

}
