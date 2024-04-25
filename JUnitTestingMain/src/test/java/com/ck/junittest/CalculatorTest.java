package com.ck.junittest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void test() {
		Calculator calculator = new Calculator();
		int actualValue = calculator.add(2, 3);
		assertEquals(5, actualValue);
	}

}
