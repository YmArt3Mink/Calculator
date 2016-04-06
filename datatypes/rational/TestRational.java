package calculator.datatypes.rational;

import static org.junit.Assert.*;

import org.junit.Test;

import calculator.OperationNotSupportedException;
import calculator.ParseValueException;

public class TestRational {

	@Test
	public void testAdd() throws OperationNotSupportedException {
		RationalValue a = new RationalValue(1, 2);
		RationalValue b = new RationalValue(1, 4);
		RationalValue c = (RationalValue) a.add(b);
		assertEquals(c.getNum(), 3);
		assertEquals(c.getDem(), 4);
	}
	@Test
	public void testSub() throws OperationNotSupportedException {
		RationalValue a = new RationalValue(1, 2);
		RationalValue b = new RationalValue(1, 4);
		RationalValue c = (RationalValue) a.sub(b);
		assertEquals(c.getNum(), 1);
		assertEquals(c.getDem(), 4);
	}
	@Test
	public void testMul() throws OperationNotSupportedException {
		RationalValue a = new RationalValue(1, 3);
		RationalValue b = new RationalValue(6, 7);
		RationalValue c = (RationalValue) a.mul(b);
		
		assertEquals(c.getNum(), 2);
		assertEquals(c.getDem(), 7);
	}
	@Test
	public void testDiv() throws OperationNotSupportedException {
		RationalValue a = new RationalValue(1, 3);
		RationalValue b = new RationalValue(7, 6);
		RationalValue c = (RationalValue) a.div(b);
		
		assertEquals(c.getNum(), 2);
		assertEquals(c.getDem(), 7);
	}
	@Test
	public void testParser() throws OperationNotSupportedException, ParseValueException {
		RationalValueParser p = new RationalValueParser();
		RationalValue a = (RationalValue) p.parse("4/3");
		
		assertEquals(a.getNum(), 4);
		assertEquals(a.getDem(), 3);
	}
}
