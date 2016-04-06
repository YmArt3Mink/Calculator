package calculator.datatypes.complex;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestComplex {
	 @Test
	  public void testRe() {
		 ComplexValue a = new ComplexValue(3, 5);
	    assertEquals(a.getRe(), 3.0, 0.001);
	  }
	 @Test
	  public void testAdd() {
		 ComplexValue a = new ComplexValue(3, 5);
		 ComplexValue b = new ComplexValue(1, -5);
		 b = (ComplexValue) b.add(a);
		 assertEquals(b.getRe(), 4.0, 0.001);
		 assertEquals(b.getIm(), 0.0, 0.001);
	  }

	 @Test
	  public void testMul() {
		 ComplexValue a = new ComplexValue(0, 1);
		 ComplexValue b = new ComplexValue(0, 1);
		 b = (ComplexValue) b.mul(a);
		 assertEquals(b.getRe(), -1.0, 0.001);
		 assertEquals(b.getIm(), 0.0, 0.001);
		 
	 }
	 @Test
	  public void testMul1() {
		 ComplexValue b = new ComplexValue(0, 1);
		 ComplexValue c = new ComplexValue(2, 3);
		 c = (ComplexValue) c.mul(b);
	 assertEquals(c.getRe(), -3.0, 0.001);
	 assertEquals(c.getIm(), 2.0, 0.001);
	 }
	 
	 @Test
	  public void TestDiv() {
		 ComplexValue a = new ComplexValue(10, -4);
		 ComplexValue b = new ComplexValue(2, 0);
		 try{
			 a = (ComplexValue) a.div(b);
		 }
		 catch(Throwable mistake){
			 System.out.println("mistake in div");
		 }
		 System.out.println(a);
	 assertEquals(a.getRe(), 5.0, 0.001);
	 assertEquals(a.getIm(), -2.0, 0.001);
	 }
	 @Test
	  public void TestDiv1() {
		 ComplexValue a = new ComplexValue(10, -4);
		 ComplexValue b = new ComplexValue(1, 1);
		 try{
			 a = (ComplexValue) a.div(b);
		 }
		 catch(Throwable mistake){
			 System.out.println("mistake in div");
		 }
		 System.out.println(a);
	 assertEquals(a.getRe(), 3.0, 0.001);
	 assertEquals(a.getIm(), -7.0, 0.001);
	 }
	 
}
