	package calculator.datatypes.vector;

import static org.junit.Assert.*;

import org.junit.Test;

//import calculator.AbstractValue;
import calculator.OperationNotSupportedException;
import calculator.datatypes.vector.VectorValue;

public class TestVector {
	
	@Test
	  public void testAdd() throws OperationNotSupportedException {
		try{
			
			double[] v1 = {1.0, 2.0};
			double[] v2 = {8.0, -1.0};
			 VectorValue a = new VectorValue(v1);
			 VectorValue b = new VectorValue(v2);
			 
			VectorValue v = (VectorValue) a.add(b);
			
		    assertEquals(v.getCoord(0), 9.0, 0.001);
		    assertEquals(v.getCoord(1), 1.0, 0.001);
		 }
		 finally{}
	}
	
	@Test
	  public void testSub() throws OperationNotSupportedException {
		try{
			
			double[] v1 = {1.0, 2.0};
			double[] v2 = {8.0, -1.0};
			 VectorValue a = new VectorValue(v1);
			 VectorValue b = new VectorValue(v2);
			 
			VectorValue v = (VectorValue) a.sub(b);
			
		    assertEquals(v.getCoord(0), -7.0, 0.001);
		    assertEquals(v.getCoord(1), 3.0, 0.001);
		 }
		 finally{}
	}
	
	@Test
	  public void testMul() throws OperationNotSupportedException {
		try{
			
			double[] v1 = {1.0, 2.0};
			double[] v2 = {2.0};
			 VectorValue a = new VectorValue(v1);
			 VectorValue b = new VectorValue(v2);
			 
			VectorValue v = (VectorValue) a.mul(b);
			
		    assertEquals(v.getCoord(0), 2.0, 0.001);
		    assertEquals(v.getCoord(1), 4.0, 0.001);
		 }
		 finally{}
	}
	
	@Test
	  public void testWrongMul() throws OperationNotSupportedException {
		try{
			
			double[] v1 = {1.0, 2.0};
			double[] v2 = {2.0, 1.0};
			 VectorValue a = new VectorValue(v1);
			 VectorValue b = new VectorValue(v2);
			 
			VectorValue v = (VectorValue) a.mul(b);
			
		    assertEquals(v.getCoord(0), 2.0, 0.001);
		    assertEquals(v.getCoord(1), 4.0, 0.001);
		 }
		 finally{}
	}
	
}	
		

	

