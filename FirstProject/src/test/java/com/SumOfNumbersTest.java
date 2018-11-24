package com;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumOfNumbersTest {

	@Test
	public void test() {
	float actual=SumOfNumbers.sumOfNumbers(28.6f,357f);
	float expected=615.3f;
		
		
		assertEquals(expected, actual, 0);
	}

}
