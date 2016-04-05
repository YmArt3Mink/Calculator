package calculator.datatypes.vector;

import calculator.AbstractValue;
import calculator.DivisionByZeroException;
import calculator.OperationNotSupportedException;
//import calculator.ParseValueException;
//import calculator.datatypes.complex.ComplexValue;
//import calculator.datatypes.real.RealValue;


public class VectorValue extends AbstractValue{
	private final double[] value;
	private int len;
	
	public VectorValue(double[] v) {
	//	super();
		this.value = v;
		 this.len = this.value.length;
	}

	 public double getCoord(int i) {return this.value[i];}
	// public double[] getVector() {return this.value ;}
	
	
	public String toString() {
		String s = "" + value[0];
		for(int i=1; i < len; i++)
		{
			s+=", ";
			s+=value[i];
		}
		return s;
	}

	
	public AbstractValue add(AbstractValue operand) throws OperationNotSupportedException {
		try {
			if(this.len != ((VectorValue) operand).len || operand.equals(null) || this.equals(null))
				{throw new OperationNotSupportedException("+");}
			double[] v = new double[this.len];
			for(int i=0; i < this.len; i++)
			{
				v[i]=this.value[i] + ((VectorValue) operand).value[i];
			}
			return (new VectorValue(v));
		} 
		finally {} 
	}
	
	public AbstractValue sub(AbstractValue operand) throws OperationNotSupportedException {
		try {
			if(this.len != ((VectorValue) operand).len || operand.equals(null) || this.equals(null))
				{throw new OperationNotSupportedException("+");}
			double[] v = new double[len];
			for(int i=0; i < this.len; i++)
			{
				v[i]=this.value[i] - ((VectorValue) operand).value[i];
			}
			return (new VectorValue(v));
		} 
		finally {} 
	}
	
	//умножает только вектор на число, но это число на самом деле вектор длины 1
	public AbstractValue mul(AbstractValue operand) throws OperationNotSupportedException {
		try {
			if(((VectorValue) operand).len != 1 || operand.equals(null) || this.equals(null))
				{throw new OperationNotSupportedException("*");}
			double[] v = new double[this.len];
			for(int i=0; i < this.len; i++)
			{
				v[i]=this.value[i] * ((VectorValue) operand).value[0];
			}
			return (new VectorValue(v));
		} 
		finally {} 
	}
	
	public AbstractValue div(AbstractValue operand) throws OperationNotSupportedException, DivisionByZeroException {
		try {
			if(((VectorValue) operand).len != 1 || operand.equals(null) || this.equals(null))
				{throw new OperationNotSupportedException("*");}
			if(((VectorValue) operand).value[0] == 0)
				{throw new DivisionByZeroException();}
			double[] v = new double[this.len];
			for(int i=0; i < this.len; i++)
			{
				v[i]=this.value[i] / ((VectorValue) operand).value[0];
			}
			return (new VectorValue(v));
		} 
		finally {} 
	}
}
