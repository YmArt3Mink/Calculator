package calculator.datatypes.complex;

import calculator.AbstractValue;
import calculator.AbstractValueParser;
import calculator.ParseValueException;
import calculator.datatypes.complex.ComplexValue;

public class ComplexValueParser implements AbstractValueParser{

	public AbstractValue parse(String value) throws ParseValueException {
		try {
			String del = "[ ]";
			String[] val = value.split(del);
			return new ComplexValue(Double.parseDouble(val[0]), Double.parseDouble(val[3]));
		} catch (NumberFormatException exception) {
			throw new ParseValueException();
		}
	}

	public String getDatatypeName() {
		return "комплексные числа";
	}

}
