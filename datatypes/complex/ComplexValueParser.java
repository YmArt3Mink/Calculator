package calculator.datatypes.complex;

import calculator.AbstractValue;
import calculator.AbstractValueParser;
import calculator.ParseValueException;

public class ComplexValueParser implements AbstractValueParser 
{

    public AbstractValue parse(String value) throws ParseValueException 
    {
        try 
        {
            int index = value.indexOf('+');
            if (index == -1)
                return new ComplexValue((Double.parseDouble(value)), 0);
            int index_i = value.indexOf('i');
            if (index_i == -1)
            	throw new NumberFormatException();
            double imaging = (Double.parseDouble(value.substring(index +1, value.length() - 1)));
            return new ComplexValue((Double.parseDouble(value.substring(0, index))), imaging);
        } catch (NumberFormatException exception) 
        {
            throw new ParseValueException();
        }
    }

    public String getDatatypeName() 
    {
        return "Комплексные числа";
    }

}
