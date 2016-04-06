package calculator.datatypes.rational;

import static org.junit.Assert.*;

import org.junit.Test;

public class RationalValueTest {

	@Test
	public void test1() {
		RationalValue a = new RationalValue(2, 3);
		RationalValue b = new RationalValue(5, 2);
		RationalValue c = new RationalValue(19, 6);
		assertTrue(c.equals(a.add(b)));
	}

	@Test
	public void test2() {
		RationalValue a = new RationalValue(5, 3);
		RationalValue b = new RationalValue(2, 3);
		RationalValue c = new RationalValue(3, 3);
		assertTrue(c.equals(a.sub(b)));
	}

	@Test
	public void test3() {
		RationalValue a = new RationalValue(1, 2);
		RationalValue b = new RationalValue(7, 6);
		RationalValue c = new RationalValue(7, 12);
		assertTrue(c.equals(a.mul(b)));
	}

	@Test
	public void test4() {
		RationalValue a = new RationalValue(3, 2);
		RationalValue b = new RationalValue(2, 1);
		RationalValue c = new RationalValue(3, 4);
		assertTrue(c.equals(a.div(b)));
	}
}
