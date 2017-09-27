package com.privalia.presentation.integration.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import com.privalia.presentation.Calculator;

public class CalculatorIntegrationTest {
	
	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		assertTrue(calc.add(2, 3) == 5);
	}
	
	@Test
	public void testSubstract() {
		Calculator calc = new Calculator();
		assertTrue(calc.substract(2, 2) == 0);
	}
	
	@Test
	public void testMultiply() {
		Calculator calc = new Calculator();
		assertTrue(calc.multiply(2, 3) == 6);
	}
	
	@Test
	public void testDivide() {
		Calculator calc = new Calculator();
		assertTrue(calc.divide(2, 2) == 1);
	}
}
