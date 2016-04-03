package calculator.datatypes.complex;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestComplex {
	 @Test
	  public void testAssertFalse() {
		 ComplexValue a = new ComplexValue(3, 5);
	    assertEquals(a.GetRe(), 3.0, 0.001);
	  }

}
