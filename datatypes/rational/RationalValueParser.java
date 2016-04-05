package calculator.datatypes.rational;

import calculator.AbstractValue;
import calculator.AbstractValueParser;
import calculator.ParseValueException;

public class RationalValueParser implements AbstractValueParser 
{

    public AbstractValue parse(String value) throws ParseValueException 
    {
        try 
        {
                int index = value.indexOf('/');
                if (index == -1)
                    return new RationalValue(Integer.parseInt(value), 1);
                int denominator = Integer.parseInt(value.substring(index + 1, value.length()));
                if (denominator == 0)
                    throw new NumberFormatException();
                 return new RationalValue(Integer.parseInt(value.substring(0, index)), denominator);
        } 
        catch (NumberFormatException exception) 
        {
            throw new ParseValueException();
        }
    }

    public String getDatatypeName() 
    {
        return "Рациональные числа";
    }



}
