package calculator.datatypes.complex;

import static org.junit.Assert.*;

import org.junit.Test;

public class ComplexValueTest {

	@Test
	public void test1() {
		ComplexValue a = new ComplexValue(1, 2);
		ComplexValue b = new ComplexValue(4, 3);
		ComplexValue c = new ComplexValue(5, 5);
		assertTrue(c.equals(a.add(b)));
	}

	@Test
	public void test2() {
		ComplexValue a = new ComplexValue(7, 1);
		ComplexValue b = new ComplexValue(3, 3);
		ComplexValue c = new ComplexValue(4, -2);
		assertTrue(c.equals(a.sub(b)));
	}

	@Test
	public void test3() {
		ComplexValue a = new ComplexValue(1, 1);
		ComplexValue b = new ComplexValue(1, -1);
		ComplexValue c = new ComplexValue(2, 0);
		assertTrue(c.equals(a.mul(b)));
	}

	@Test
	public void test4() {
		ComplexValue a = new ComplexValue(1, -1);
		ComplexValue b = new ComplexValue(1, 1);
		ComplexValue c = new ComplexValue(0, -1);
		assertTrue(c.equals(a.div(b)));
	}

}
