package calculator.datatypes.complex;

import calculator.AbstractValue;
import calculator.AbstractValueParser;
import calculator.ParseValueException;
import calculator.datatypes.complex.ComplexValue;

public class ComplexValueParser implements AbstractValueParser{

	public AbstractValue parse(String value) throws ParseValueException {
		try {
			String del = "[+]";
			String[] val = value.split(del);
			char i = val[1].charAt(0);
			return new ComplexValue(Double.parseDouble(val[0]), Double.parseDouble(val[1]));
		} catch (NumberFormatException exception) {
			throw new ParseValueException();
		}
	}

	public String getDatatypeName() {
		return "комплексные числа";
	}

}
