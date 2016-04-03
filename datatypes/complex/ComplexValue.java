package calculator.datatypes.complex;

import calculator.AbstractValue;
import calculator.DivisionByZeroException;
import calculator.datatypes.real.RealValue;


public class ComplexValue extends AbstractValue{
	private final double re;
	private final double im;
	
	public ComplexValue(double re, double im) {
		super();
		this.re = re;
		this.im = im;
	}

	public double GetRe() {return this.re;}
	
	public String toString() {
		return Double.toString(re + '+'+ im + 'i');
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
				im + ((ComplexValue) operand).re +
				re * ((ComplexValue) operand).im
				);
	}

	public AbstractValue div(AbstractValue operand)
			throws DivisionByZeroException {
		ComplexValue Value = new ComplexValue(
				(re * ((ComplexValue) operand).re +
				im + ((ComplexValue) operand).im)/
				(((ComplexValue) operand).re*((ComplexValue) operand).re +
						((ComplexValue) operand).im*((ComplexValue) operand).im),
				(im * ((ComplexValue) operand).re - 
				re * ((ComplexValue) operand).im)/
				(((ComplexValue) operand).re*((ComplexValue) operand).re +
						((ComplexValue) operand).im*((ComplexValue) operand).im)
				);
		double reValue = Value.re;
		double imValue = Value.im;
		if (reValue == 0.0 & imValue == 0.0)
			throw new DivisionByZeroException();
		return Value;
	}

}
