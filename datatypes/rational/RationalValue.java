package calculator.datatypes.rational;

import calculator.AbstractValue;

public class RationalValue extends AbstractValue 
{

    private final int numerator;
    private final int denomerator;

    public RationalValue(int numerator, int denomerator) 
    {
        super();
        int nod = nod(numerator, denomerator);
        if (denomerator < 0) {
            numerator *= -1;
            denomerator *= -1;
            nod *= -1;
        }
        this.numerator = numerator / nod;
        this.denomerator = denomerator / nod;

    }

    public String toString() 
    {
        return String.format("%d/%d", numerator, denomerator);
    }

    public Integer nod(int firstNumber, int secondNumer){
        while (secondNumer != 0) 
        {
            int tmp = firstNumber % secondNumer;
            firstNumber = secondNumer;
            secondNumer = tmp;
        }
        return firstNumber;
    }


    public AbstractValue add(AbstractValue operand) 
    {
        int opreandDenominator = ((RationalValue) operand).denomerator;
        int opreandNumerator = ((RationalValue) operand).numerator;
        return new RationalValue(numerator * opreandDenominator + opreandNumerator * denomerator, denomerator * opreandDenominator);
    }

    public AbstractValue sub(AbstractValue operand) 
    {
        int opreandDenominator = ((RationalValue) operand).denomerator;
        int opreandNumerator = ((RationalValue) operand).numerator;
        return new RationalValue(numerator * opreandDenominator - opreandNumerator * denomerator, denomerator * opreandDenominator);
    }

    public AbstractValue mul(AbstractValue operand) 
    {
        return new RationalValue(numerator * ((RationalValue) operand).numerator, denomerator * ((RationalValue) operand).denomerator);
    }

    public AbstractValue div(AbstractValue operand)
    {
        return new RationalValue(numerator * ((RationalValue) operand).denomerator, denomerator * ((RationalValue) operand).numerator);
    }
    
    public boolean equals(AbstractValue operand)
    { 
    	boolean f = this.numerator == ((RationalValue)operand).numerator && this.denomerator == ((RationalValue)operand).denomerator; 
    	return f;
    }
}
