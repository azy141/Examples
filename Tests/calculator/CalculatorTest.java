package com.fdmgroup.calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class CalculatorTest {
	
	private Calculator calculator;
	
	@Before
	public void setup(){
		calculator = new Calculator();
		
	}
	
	
	
	@Test
	public void testThatWhenTwoAndTwoArePassedAsDoublesToTheAddMethodThatFourIsReturnedAsADouble(){
		
		
		double result = calculator.add(2.0,2.0);
		assertEquals(4.0,result,0.01);
		
		
	}
	
	@Test
	public void testThatWhenTwoAndTwoArePassedAsDoublesToTheSubtractMethodThatTwoIsReturnedAsADouble(){
		
		double result = calculator.subtract(4.0,2.0);
		assertEquals(2.0,result,0.01);

	}
	
	@Test
	public void testThatWhenTwoarePassedAsDoublesToTheMultiplicationMethodThatFourIsReturnedAsADouble(){
		
		double result = calculator.multiply(2.0,2.0);
		double result1 = calculator.multiply(3.0,-2.0);
		double result2 = calculator.multiply(7.0,7.0);
		assertEquals(4.0,result,0.01);
		assertEquals(-6.0,result1,0.01);
		assertEquals(49.0,result2,0.01);

	}
}
