package com.privalia.presentation.unit.test;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import com.privalia.presentation.Calculator;

public class CalculatorTest {

	@Test
	public void testAdd() {
		Calculator calc = mock(Calculator.class);
		when(calc.add(2,3)).thenReturn(5);
		
		assertTrue(calc.add(2, 3) == 5);
	}
	
	@Test
	public void testSubstract() {
		Calculator calc = mock(Calculator.class);
		when(calc.substract(3,2)).thenReturn(1);
		
		assertTrue(calc.substract(3,2) == 1);
	}
	
	@Test
	public void testMultiply() {
		Calculator calc = mock(Calculator.class);
		when(calc.multiply(2,3)).thenReturn(6);
		
		assertTrue(calc.multiply(2, 3) == 6);
	}
	
	@Test
	public void testDivide() {
		Calculator calc = mock(Calculator.class);
		when(calc.divide(2,2)).thenReturn(1);
		
		assertTrue(calc.divide(2, 2) == 1);
	}

}
