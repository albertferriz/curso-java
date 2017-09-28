package com.privalia.presentation.integration.test;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import com.privalia.presentation.Calculator;
import com.privalia.presentation.ICalculator;

public class CalculatorIntegrationTest {
	
	@Test
	public void testAdd() {
		ICalculator calc = new Calculator();
		assertTrue(calc.add(2, 3) == 5);
	}
	
	@Test
	public void testSubstract() {
		ICalculator calc = new Calculator();
		assertTrue(calc.substract(2, 2) == 0);
	}
	
	@Test
	public void testMultiply() {
		ICalculator calc = new Calculator();
		assertTrue(calc.multiply(2, 3) == 6);
	}
	
	@Test
	public void testDivide() {
		ICalculator calc = new Calculator();
		assertTrue(calc.divide(2, 2) == 1);
	}
}
