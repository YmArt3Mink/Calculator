package calculator.datatypes.complex;

import calculator.AbstractValue;

public class ComplexValue extends AbstractValue 
{
    private final double real;
    private final double imaginary;


    public ComplexValue(double real, double imaginary) 
    {
        super();
        this.real = real;
        this.imaginary = imaginary;
    }

    public String toString() 
    {
        return String.format("%.2f+%.2fi", real, imaginary);
    }

    public AbstractValue add(AbstractValue operand) 
    {
        return new ComplexValue((real + ((ComplexValue)operand).real), (imaginary + ((ComplexValue) operand).imaginary));
    }

    public AbstractValue sub(AbstractValue operand) 
    {
        return new ComplexValue((real - ((ComplexValue)operand).real), (imaginary - ((ComplexValue) operand).imaginary));
    }

    public AbstractValue mul(AbstractValue operand) 
    {
        double imag = ((ComplexValue) operand).imaginary;
        double re = ((ComplexValue) operand).real;
        return new ComplexValue((real * re - imaginary * imag), (real*imag + imaginary * re));
    }

    public AbstractValue div(AbstractValue operand)
    {
        double imag = ((ComplexValue) operand).imaginary;
        double re = ((ComplexValue) operand).real;
        double znamen = re*re + imag*imag;
        return new ComplexValue((real*re + imaginary * imag) / znamen, (imaginary*re - real * imag) / znamen);
    }
    
   public boolean equals(AbstractValue operand)
    { 
    	boolean f = this.real == ((ComplexValue)operand).real && this.imaginary == ((ComplexValue)operand).imaginary; 
    	return f;
    }

}
