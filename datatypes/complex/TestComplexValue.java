package calculator.datatypes.complex;

import static org.junit.Assert.*;

import org.junit.Test;

import calculator.datatypes.rational.RationalValue;

public class TestComplexValue {

	@Test
	public void testAdd() 
	{
		RationalValue a = new RationalValue(1, 4);
		RationalValue b = new RationalValue(1, 4);
		RationalValue c = new RationalValue(1, 2);
		assertTrue(c.equals(a.add(b)));
	}
	
	@Test
	public void testSub() 
	{
		ComplexValue a = new ComplexValue(3, 2);
		ComplexValue b = new ComplexValue(1, 2);
		ComplexValue c = new ComplexValue(2, 0);
		assertTrue(c.equals(a.sub(b)));
	}

	@Test
	public void testMul() 
	{
		ComplexValue a = new ComplexValue(2, 2);
		ComplexValue b = new ComplexValue(2, 2);
		ComplexValue c = new ComplexValue(0, 8);
		assertTrue(c.equals(a.mul(b)));
	}
	
	@Test
	public void testDiv() 
	{
		ComplexValue a = new ComplexValue(6, 4);
		ComplexValue b = new ComplexValue(3, 2);
		ComplexValue c = new ComplexValue(2, 0);
		assertTrue(c.equals(a.div(b)));
	}
}
