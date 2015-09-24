package com.codesprinters.automation;

import org.junit.Test;
import org.junit.runner.RunWith;

import junit.framework.Assert;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class ParametrizedTests {

	@Test
	@Parameters({ "2,3,6", "1,2,2", "3,3,9", "2,4,8", "1,1,1" })
	public void shouldMultipleParamsNumbers(int a, int b, int expected) {
		int result = multiply(a, b);
		Assert.assertEquals(expected, result);

	}

	private int multiply(int a, int b) {

		return a * b;
	}

}
