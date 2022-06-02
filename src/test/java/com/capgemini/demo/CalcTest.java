package com.capgemini.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

public class CalcTest {
	@Test
	public void TestAddNums() {
		Calc cal = new Calc();
		int expected = 40;
		int actual = cal.addNums(10, 30);
		assertEquals(expected, actual);

	}
	@Test
	public void TestAddNums1() {
		Calc cal = new Calc();
		int unexpected = 30;
		int actual = cal.addNums(10, 30);
		assertNotEquals(unexpected, actual);

	}
}