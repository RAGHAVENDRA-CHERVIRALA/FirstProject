package com;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumOfNumbersTest {

	@Test
	public void test() {
	int actual=SumOfNumbers.sumOfNumbers(258,357);
	int expected=615;
		assertEquals(expected,actual);
		
		
	}

}
