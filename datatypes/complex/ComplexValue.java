package calculator.datatypes.complex;

import calculator.AbstractValue;
import calculator.DivisionByZeroException;
// import calculator.datatypes.real.RealValue;


public class ComplexValue extends AbstractValue{
	private final double re;
	private final double im;
	
	public ComplexValue(double re, double im) {
		super();
		this.re = re;
		this.im = im;
	}

	public double getRe() {return this.re;}
	public double getIm() {return this.im;}
	
	public String toString() {
		return (re + " + i " + im);
	}

	public AbstractValue add(AbstractValue operand) {
		return new ComplexValue(
				re + ((ComplexValue) operand).re,
				im + ((ComplexValue) operand).im);
	}

	public AbstractValue sub(AbstractValue operand) {
		return new ComplexValue(
				re - ((ComplexValue) operand).re,
				im - ((ComplexValue) operand).im);
	}

	public AbstractValue mul(AbstractValue operand) {
		return new ComplexValue(
				re * ((ComplexValue) operand).re - 
				im * ((ComplexValue) operand).im,
				im * ((ComplexValue) operand).re +
				re * ((ComplexValue) operand).im
				);
	}

	public AbstractValue div(AbstractValue operand)
			throws DivisionByZeroException {
		
		double reValue = ((ComplexValue) operand).getRe();
		double imValue = ((ComplexValue) operand).getIm();
		if (reValue == 0.0 && imValue == 0.0)
			throw new DivisionByZeroException();
		
		ComplexValue Value = new ComplexValue(
				(re * reValue + im * imValue)/
					(reValue*reValue + imValue*imValue),
				(im * reValue - re * imValue)/
					(reValue*reValue + imValue*imValue)
				);
		
		return Value;
	}

}
