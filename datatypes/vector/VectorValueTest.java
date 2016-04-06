package calculator.datatypes.vector;

import static org.junit.Assert.*;

import org.junit.Test;

import calculator.OperationNotSupportedException;
import java.util.ArrayList;

public class VectorValueTest {

	@Test
	public void test1() throws OperationNotSupportedException
	 	{	
	 	ArrayList<Double> Vec = new ArrayList<Double>();
	 		Vec.add(3.5);
	 		Vec.add(1.0);
	 		VectorValue a = new VectorValue(Vec);
	 		Vec.set(0, 1.5);
	 		Vec.set(1, 4.5);
	 		VectorValue b = new VectorValue(Vec);
	 		Vec.set(0, 5.0);
	 		Vec.set(1, 5.5);
	 		VectorValue c = new VectorValue(Vec);
	 		assertTrue(c.equals(a.add(b)));
	 	}
	 	
	 	@Test
	 	public void test2() throws OperationNotSupportedException
	 	{	
	 		ArrayList<Double> Vec = new ArrayList<Double>();
	 		Vec.add(8.0);
	 		Vec.add(3.0);
	 		VectorValue a = new VectorValue(Vec);
	 		Vec.set(0, 5.0);
	 		Vec.set(1, 1.0);
	 		VectorValue b = new VectorValue(Vec);
	 		Vec.set(0, 3.0);
	 		Vec.set(1, 2.0);
	 		VectorValue c = new VectorValue(Vec);
	 		assertTrue(c.equals(a.sub(b)));
	 	}

}
