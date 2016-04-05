package calculator.datatypes.rational;

import static org.junit.Assert.*;
import org.junit.Test;
//import org.junit.Assert;

public class TestRationalValue 
{

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
		RationalValue a = new RationalValue(1, 2);
		RationalValue b = new RationalValue(1, 4);
		RationalValue c = new RationalValue(1, 4);
		assertTrue(c.equals(a.sub(b)));
	}

	@Test
	public void testMul() 
	{
		RationalValue a = new RationalValue(1, 4);
		RationalValue b = new RationalValue(1, 4);
		RationalValue c = new RationalValue(1, 16);
		assertTrue(c.equals(a.mul(b)));
	}
	
	@Test
	public void testDiv() 
	{
		RationalValue a = new RationalValue(3, 2);
		RationalValue b = new RationalValue(2, 1);
		RationalValue c = new RationalValue(3, 4);
		assertTrue(c.equals(a.div(b)));
	}
}
